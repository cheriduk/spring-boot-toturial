package com.duke.tutorial.designpatterns.singleton.demo01;

import java.lang.reflect.Constructor;

public class StaticInnerClassReflect {
    public static void main(String[] args) throws Exception {
        Class objClass = StaticInnerClass.class;
        //获取类的构造器
        Constructor constructor = objClass.getDeclaredConstructor();
        //把构造器私有权限放开
        constructor.setAccessible(true);
        //正常的获取实例方式
        StaticInnerClass staticInnerClass = StaticInnerClass.getInstance();
        //反射创建实例
        StaticInnerClass newStaticInnerClass = (StaticInnerClass) constructor.newInstance();


        System.out.println(staticInnerClass);
        System.out.println(newStaticInnerClass);
        System.out.println(staticInnerClass == newStaticInnerClass);

    }
}
