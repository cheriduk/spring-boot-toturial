package com.duke.tutorial.designpatterns.proxy.demo01;

public class ProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHousePerson();
        buyHouse.buyHosue();
        System.out.println("=====================================");
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHosue();
    }
}