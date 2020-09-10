package com.duke.tutorial.designpatterns.singleton.demo01.attack;

public class SafeSingleton {
    private volatile static SafeSingleton INSTANCE;

    private SafeSingleton() {
        //如果已存在，直接抛出异常，保证只会被new 一次
        if (INSTANCE != null) {
            throw new RuntimeException("对象已存在不可重复创建");
        }
    }

    public static SafeSingleton getInstance() {
        if (INSTANCE == null) {
            //同步代码块
            synchronized (SafeSingleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SafeSingleton();
                }
            }
        }
        return INSTANCE;
    }

}
