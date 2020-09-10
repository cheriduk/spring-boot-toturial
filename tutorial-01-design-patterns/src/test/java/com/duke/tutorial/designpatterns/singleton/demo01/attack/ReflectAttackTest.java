package com.duke.tutorial.designpatterns.singleton.demo01.attack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectAttackTest {

    public static void main(String[] args) {
        SafeSingleton singleton = SafeSingleton.getInstance();
        Class clazz = singleton.getClass();
        try {
            Constructor<SafeSingleton> constructor = clazz.getDeclaredConstructors()[0];

            //设置允许访问私有的构造器
            constructor.setAccessible(true);
            SafeSingleton singleton1 = constructor.newInstance();

            if (singleton1 != null&&singleton1.getClass().equals(singleton.getClass())) {
                System.out.println("通过反射构造了对象");
            }

            if (singleton == singleton1) {
                System.out.println("是同一个对象");
            } else {
                System.out.println("是两个不同的对象");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
