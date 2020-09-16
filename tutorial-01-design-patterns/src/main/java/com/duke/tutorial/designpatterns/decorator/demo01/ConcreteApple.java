package com.duke.tutorial.designpatterns.decorator.demo01;

/**
 * @author Cheri_Du
 */
public class ConcreteApple implements Apple {

    @Override
    public void res() {
        System.out.println("普通的苹果");
    }

    @Override
    public Integer layer() {
        return 0;
    }

}
