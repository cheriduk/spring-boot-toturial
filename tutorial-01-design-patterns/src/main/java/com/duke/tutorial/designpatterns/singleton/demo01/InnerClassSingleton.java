package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 线程安全的懒汉式单例
 */
public class InnerClassSingleton {
    // 私有内部类，按需加载，用时加载，也就是延迟加载
    private static class Holder {
        private static InnerClassSingleton singleton5 = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getSingleton5() {
        return Holder.singleton5;
    }
}
