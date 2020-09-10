package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 线程安全的懒汉式单例
 */
public class ThreadLocalSingleton {
    // ThreadLocal 线程局部变量
    private static ThreadLocal<ThreadLocalSingleton> threadLocal = new ThreadLocal<ThreadLocalSingleton>();
    private static ThreadLocalSingleton singleton4 = null;

    private ThreadLocalSingleton() {}

    public static ThreadLocalSingleton getSingleton4() {
        if (threadLocal.get() == null) {        // 第一次检查：该线程是否第一次访问
            createSingleton4();
        }
        return singleton4;
    }

    public static void createSingleton4() {
        synchronized (ThreadLocalSingleton.class) {
            if (singleton4 == null) {          // 第二次检查：该单例是否被创建
                singleton4 = new ThreadLocalSingleton();   // 只执行一次
            }
        }
        threadLocal.set(singleton4);      // 将单例放入当前线程的局部变量中

    }
}