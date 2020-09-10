package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * Singleton实现了java.io.Serializable接口，
 * 那么这个类的实例就可能被序列化和复原。不管怎样，如果你序列化一个单例类的对象，
 * 接下来复原多个那个对象，那你就会有多个单例类的实例
 *
 * 解决方法 readResolve
 */
public class Singleton implements java.io.Serializable {
    public static Singleton INSTANCE = new Singleton();

    protected Singleton() {
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
