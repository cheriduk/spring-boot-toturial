package com.duke.tutorial.designpatterns.singleton.demo01.attack;

import java.io.Serializable;

public class DoubleLockFlagReflect implements Serializable {
    public static volatile DoubleLockFlagReflect doubleLock = null;
    //volatile防止指令重排序，内存可见(缓存中的变化及时刷到主存，并且其他的内存失效，必须从主存获取)

    private static boolean flag = true; //设置标识属性

    private DoubleLockFlagReflect() {
        if (flag) {               //初始为true，进入构造器正常创建对象，然后把flag的值改成false，后面的就会抛异常
            flag = false;
        } else {
            throw new IllegalStateException();
        }
    }

    public static DoubleLockFlagReflect getInstance() {
        if (doubleLock == null) {
            synchronized (DoubleLockFlagReflect.class) {
                if (doubleLock == null) {
                    doubleLock = new DoubleLockFlagReflect();
                }
            }
        }
        return doubleLock;
    }

    private Object readResolve() {
        return doubleLock;
    }

}
