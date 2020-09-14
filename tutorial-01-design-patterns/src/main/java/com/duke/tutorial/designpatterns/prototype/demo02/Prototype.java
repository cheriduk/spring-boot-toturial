package com.duke.tutorial.designpatterns.prototype.demo02;

public interface Prototype {
    public Prototype clone();
    public String getName();
    public void setName(String name);
}
