package com.duke.tutorial.designpatterns.singleton.demo01;

/**
 * 如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
 * 假定不是远端存取，
 * 例如一些servlet容器对每个servlet使用完全不同的类装载器，
 * 这样的话如果有两个servlet访问一个单例类，它们就都会有各自的实例。
 */
public class ClassLoaderSingle {

    private static Class getClass(String classname)

        throws ClassNotFoundException {

        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader == null) { classLoader = ClassLoaderSingle.class.getClassLoader(); }

        return (classLoader.loadClass(classname));

    }

}

