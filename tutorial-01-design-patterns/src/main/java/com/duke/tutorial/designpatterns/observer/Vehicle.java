package com.duke.tutorial.designpatterns.observer;


/**
 * 抽象观察者类：车
 *
 * @author Cheri_Du
 */
public interface Vehicle {
    //事件处理方法，看见
    public void see(SignalColor e);
}
