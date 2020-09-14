package com.duke.tutorial.designpatterns.singleton.demo01;

import java.lang.reflect.Constructor;

public class DoubleLockReflectTest {
    public static void main(String[] args) throws Exception {
        Class objClass = DoubleLockReflect.class;
        //获取类的构造器
        Constructor constructor = objClass.getDeclaredConstructor();
        //把构造器私有权限放开
        constructor.setAccessible(true);
        //反射创建实例   注意反射创建要放在前面，才会攻击成功，因为如果反射攻击在后面，先使用正常的方式创建实例的话，在构造器中判断是可以防止反射攻击、抛出异常的，
        //因为先使用正常的方式已经创建了实例，会进入if
        DoubleLockReflect o1= (DoubleLockReflect) constructor.newInstance();
        //正常的获取实例方式   正常的方式放在反射创建实例后面，这样当反射创建成功后，单例对象中的引用其实还是空的，反射攻击才能成功
        DoubleLockReflect o2= DoubleLockReflect.getInstance();


        System.out.println(o2);
        System.out.println(o1);
        System.out.println(o1 == o2);

    }
}
