package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 饿汉式的拓展写法
 */
public class HungrySingleton2 {
    private static HungrySingleton2 instance = null;

    static {
        instance = new HungrySingleton2();
    }

    private HungrySingleton2() {}

    public static HungrySingleton2 getInstance() {
        return instance;
    }
}
