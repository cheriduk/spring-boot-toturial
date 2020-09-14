package com.duke.tutorial.designpatterns.singleton.demo01.attack;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class DoubleLockFlagReflectTest {
    public static void main(String[] args) throws Exception {
        Class objClass = DoubleLockFlagReflect.class;
        Constructor constructor = objClass.getDeclaredConstructor();
        //构造器权限
        constructor.setAccessible(true);

        //正常获取实例
        DoubleLockFlagReflect o1 = DoubleLockFlagReflect.getInstance();

        //获取到这个实例的flag属性
        Field flag = o1.getClass().getDeclaredField("flag");
        //属性权限放开
        flag.setAccessible(true);
        //属性值改为true
        flag.set(o1, true);
        DoubleLockFlagReflect o2 = (DoubleLockFlagReflect)constructor.newInstance();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o1 == o2);

    }
}
