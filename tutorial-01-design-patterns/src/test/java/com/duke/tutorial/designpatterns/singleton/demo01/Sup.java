package com.duke.tutorial.designpatterns.singleton.demo01;

public class Sup {
    private static final Sup instance = new Sup(); // 1.

     Sup() {} // 2.

    public static Sup getInstance() { //3.
        return instance;
    }
}
