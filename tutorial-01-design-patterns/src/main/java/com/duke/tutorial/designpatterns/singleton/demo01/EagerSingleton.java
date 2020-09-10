package com.duke.tutorial.designpatterns.singleton.demo01;

public class EagerSingleton {
    // jvm保证在任何线程访问uniqueInstance静态变量之前一定先创建了此实例
    public static EagerSingleton uniqueInstance = new EagerSingleton();

    // 私有的默认构造子，保证外界无法直接实例化
    private EagerSingleton() {
    }
}