package com.duke.tutorial.designpatterns.factory.abstracts;

public class MAC implements PC {
    public MAC() {
        this.make();
    }
    @Override
    public void make() {
        System.out.println("make MAC!");
    }
}
