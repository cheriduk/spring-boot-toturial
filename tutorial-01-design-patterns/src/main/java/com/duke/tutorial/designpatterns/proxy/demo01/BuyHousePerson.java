package com.duke.tutorial.designpatterns.proxy.demo01;

public class BuyHousePerson implements BuyHouse {

    @Override
    public void buyHosue() {
        System.out.println("我要买房");
    }
}
