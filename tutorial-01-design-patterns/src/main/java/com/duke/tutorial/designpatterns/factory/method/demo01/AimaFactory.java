package com.duke.tutorial.designpatterns.factory.method.demo01;

/**
 * 具体工厂：爱玛工厂
 * @author Cheri_Du
 */
public class AimaFactory implements BicycleFactory {
    @Override
    public Bicycle produce() {
        System.out.println("爱玛自行车生产了！");
        return new AimaBicycle();
    }
}
