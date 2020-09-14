package com.duke.tutorial.designpatterns.factory.method.demo01;

/**
 * 具体工厂：雅迪工厂
 * @author Cheri_Du
 */
public class YadeaFactory implements BicycleFactory {
    @Override
    public Bicycle produce() {
        System.out.println("雅迪自行车生产了！");
        return new YadeaBicycle();
    }
}
