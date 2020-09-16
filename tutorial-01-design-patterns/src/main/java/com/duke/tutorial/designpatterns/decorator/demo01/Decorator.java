package com.duke.tutorial.designpatterns.decorator.demo01;

/**
 * @author Cheri_Du
 */
public abstract class Decorator implements Apple {

    protected Apple apple;

    public Decorator(Apple apple) {
        this.apple = apple;
    }
    @Override
    public void res() {
        apple.res();
    }

    @Override
    public Integer layer() {
        return apple.layer();
    }
}
