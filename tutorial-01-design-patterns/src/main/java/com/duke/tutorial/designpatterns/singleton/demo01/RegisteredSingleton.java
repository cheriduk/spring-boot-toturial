package com.duke.tutorial.designpatterns.singleton.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * 类似Spring里面的方法，将类名注册，下次从里面直接获取
 */
public class RegisteredSingleton {
    // 存储需要进行维护和管理的类的实例
    private static Map<String, RegisteredSingleton> map = new HashMap<String, RegisteredSingleton>();
    static {
        // 静态创建实例并添加到Map集合
        RegisteredSingleton singleton = new RegisteredSingleton();
        map.put(singleton.getClass().getSimpleName(), singleton);
    }

    // 保护的默认构造子
    protected RegisteredSingleton() {
    }

    // 静态工厂方法,返还此类惟一的实例
    public static RegisteredSingleton getInstance(String name) {
        if (name == null) {
            name = RegisteredSingleton.class.getName();
            System.out.println("name == null" + "--->name=" + name);
        }
        if (map.get(name) == null) {
            try {
                map.put(name, (RegisteredSingleton) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

    // 一个示意性的商业方法
    public String about() {
        return "Hello, I am RegSingleton.";
    }

    public static void main(String[] args) {
        RegisteredSingleton singleton = RegisteredSingleton.getInstance("RegisteredSingleton");
        System.out.println(singleton.about());
    }
}
