package com.duke.tutorial.designpatterns.observer;

/**
 * 具体观察者类：轿车
 * @author Cheri_Du
 */
public class Car implements Vehicle {
    @Override
    public void see(SignalColor e) {
        if ("红色".equals(e.getColor())) {
            System.out.println("红灯亮，轿车停！");
        } else {
            System.out.println("绿灯亮，轿车行！");
        }
    }
}