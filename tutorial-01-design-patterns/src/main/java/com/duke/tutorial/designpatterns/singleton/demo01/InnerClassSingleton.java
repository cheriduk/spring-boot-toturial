package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 线程安全的懒汉式单例
 * 用静态内部类实现单例模式
 *
 * 1.从外部无法访问静态内部类LazyHolder，只有当调用Singleton.getInstance方法的时候，
 * 才能得到单例对象INSTANCE。
 *
 * 2.INSTANCE对象初始化的时机并不是在单例类Singleton被加载的时候，而是在调用getInstance方法，
 * 使得静态内部类LazyHolder被加载的时候。因此这种实现方式是利用classloader
 * 的加载机制来实现懒加载，并保证构建单例的线程安全。
 *
 * 真正的懒加载方式
 */
public class InnerClassSingleton {
    // 私有内部类，按需加载，用时加载，也就是延迟加载
    private static class Holder {
        // jvm保证在任何线程访问singleton5静态变量之前一定先创建了此实例
        private static final InnerClassSingleton singleton5 = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getSingleton5() {
        return Holder.singleton5;
    }
}
