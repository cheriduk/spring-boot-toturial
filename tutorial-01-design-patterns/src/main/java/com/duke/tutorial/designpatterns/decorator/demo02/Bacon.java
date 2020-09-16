package com.duke.tutorial.designpatterns.decorator.demo02;


/**
 * Created by noteless on 2018/9/6.
 * Description:培根
 */
public class Bacon extends Decorator {
    Bacon(HandPancake handPancake) {
        super(handPancake);
    }

    @Override
    public String offerHandPancake() {
        return super.offerHandPancake() + " 加培根";
    }

    @Override
    public Integer calcCost() {
        return super.calcCost() + 4;
    }
}





