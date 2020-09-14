package com.duke.tutorial.designpatterns.singleton.demo01;

public class LazySingleton {
    //懒汉式单例模式
    //比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢

    private static LazySingleton intance = null;//静态私用成员，没有初始化

    private LazySingleton() {
        //私有构造函数
    }

    //静态，同步，公开访问点
    public static LazySingleton getInstance() {
        if (intance == null) {
            intance = new LazySingleton();
        }
        return intance;
    }
}
