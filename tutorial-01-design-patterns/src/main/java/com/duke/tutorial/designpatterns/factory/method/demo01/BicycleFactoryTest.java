package com.duke.tutorial.designpatterns.factory.method.demo01;

/**
 * @author Cheri_Du
 */
public class BicycleFactoryTest {
    public static void main(String[] args) {
        BicycleFactory bf = new YadeaFactory();
        Bicycle a =bf.produce();
        a.show();
    }
}
