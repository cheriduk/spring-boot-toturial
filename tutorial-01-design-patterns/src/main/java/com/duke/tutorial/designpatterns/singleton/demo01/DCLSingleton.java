package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 线程安全的懒汉式单例
 */
public class DCLSingleton {
    //使用volatile关键字防止重排序，因为 new Instance()是一个非原子操作，可能创建一个不完整的实例
    private static volatile DCLSingleton singleton3;

    private DCLSingleton() {
    }

    public static DCLSingleton getSingleton3() {
        // Double-Check idiom
        if (singleton3 == null) {
            synchronized (DCLSingleton.class) {       // 1
                // 只需在第一次创建实例时才同步
                if (singleton3 == null) {       // 2
                    singleton3 = new DCLSingleton();      // 3
                }
            }
        }
        return singleton3;
    }
}
