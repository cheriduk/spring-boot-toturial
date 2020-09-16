package com.duke.tutorial.designpatterns.decorator.demo02;

public class Vegetable extends Decorator {
    Vegetable(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake() + " 加青菜";
    }

    @Override
    public Integer calcCost() {
        return super.calcCost() + 1;
    }

}
