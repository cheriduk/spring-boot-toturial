package com.duke.tutorial.designpatterns.singleton.demo01;

import java.io.Serializable;

/**
 * 双重锁校验的单例
 */
public class DoubleLockReflect implements Serializable {

    public static volatile DoubleLockReflect doubleLock = null;//volatile防止指令重排序，内存可见(缓存中的变化及时刷到主存，并且其他的内存失效，必须从主存获取)

    private DoubleLockReflect() {
        //构造器必须私有  不然直接new就可以创建
        //构造器判断，防止反射攻击
        if(doubleLock != null){
            throw new IllegalStateException("不能重复创建对象");
        }
    }

    public static DoubleLockReflect getInstance() {
        //第一次判断，假设会有好多线程，如果doubleLock没有被实例化，那么就会到下一步获取锁，只有一个能获取到，
        //如果已经实例化，那么直接返回了，减少除了初始化时之外的所有锁获取等待过程
        if (doubleLock == null) {
            synchronized (DoubleLockReflect.class) {
                //第二次判断是因为假设有两个线程A、B,两个同时通过了第一个if，然后A获取了锁，进入然后判断doubleLock是null，他就实例化了doubleLock，然后他出了锁，
                //这时候线程B经过等待A释放的锁，B获取锁了，如果没有第二个判断，那么他还是会去new DoubleLock()，再创建一个实例，所以为了防止这种情况，需要第二次判断
                if (doubleLock == null) {
                    //下面这句代码其实分为三步：
                    //1.开辟内存分配给这个对象
                    //2.初始化对象
                    //3.将内存地址赋给虚拟机栈内存中的doubleLock变量
                    //注意上面这三步，第2步和第3步的顺序是随机的，这是计算机指令重排序的问题
                    //假设有两个线程，其中一个线程执行下面这行代码，如果第三步先执行了，就会把没有初始化的内存赋值给doubleLock
                    //然后恰好这时候有另一个线程执行了第一个判断if(doubleLock == null)，然后就会发现doubleLock指向了一个内存地址
                    //这另一个线程就直接返回了这个没有初始化的内存，所以要防止第2步和第3步重排序
                    // 采用volatile修饰单例引用
                    doubleLock = new DoubleLockReflect();
                }
            }
        }
        return doubleLock;
    }

    private Object readResolve(){
        return doubleLock;
    }

}
