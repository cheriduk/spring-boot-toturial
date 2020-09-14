package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * Java单例---静态内部类
 * 主要原理是：加载一个类时，其内部类不会同时被加载。
 * 一个类被加载，当且仅当其某个静态成员（静态域、构造器、静态方法等）被调用时发生，
 * 也就是说内部类：InnerClass只有我们调用getInstance()的时候才会被加载。
 */
public class StaticInnerClass {

    private static class InnerClass {
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return InnerClass.staticInnerClass;
    }

    private StaticInnerClass() {

    }
}
