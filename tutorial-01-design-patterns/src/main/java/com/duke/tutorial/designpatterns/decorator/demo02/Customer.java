package com.duke.tutorial.designpatterns.decorator.demo02;

public class Customer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    public void buy(HandPancake handPancake) {
        System.out.println(name + "购买了 : " + handPancake.offerHandPancake() +
            " 一份, 花了 : " + handPancake.calcCost() + "块钱~");
        System.out.println();
    }
}
