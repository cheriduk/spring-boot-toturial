package com.duke.tutorial.designpatterns.proxy;

public class HouseProxy implements HouseOwner {
    private SgBiguiyuan realSubject = new SgBiguiyuan();

    @Override
    public void display() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void display2() {
        preRequest();
        realSubject.display();
        postRequest();
    }

    public void preRequest() {
        System.out.println("房产中介介绍韶关碧桂园房子。");
    }

    public void postRequest() {
        System.out.println("房产中介登记购房者信息。");
    }
}
