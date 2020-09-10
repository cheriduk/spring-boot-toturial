package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 饿汉式单例
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 * 饿汉式单例在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以是线程安全的，
 * 可以直接用于多线程而不会出现问题。
 * <守护线程或初始化资源线程 可以使用>
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton(); // 1.

    private HungrySingleton() {} // 2.

    public static HungrySingleton getInstance() { //3.
        return instance;
    }
}