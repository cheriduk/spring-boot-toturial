package com.duke.tutorial.designpatterns.singleton.demo01.attack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 饿汉式的单例 处理策略
 * 如果是懒汉式的单例呢？能否通过这种方式来实现？答案是不能。
 * 懒汉式一开始加载的时候成员变量是null，也就无法通过判断是否为null来阻止反射获取实例
 */
public class ReflectAttackSingleton {
    private final static ReflectAttackSingleton hungrySingleton;

    static {
        hungrySingleton = new ReflectAttackSingleton();
    }

    private ReflectAttackSingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static ReflectAttackSingleton getInstance() {
        return hungrySingleton;
    }


}
