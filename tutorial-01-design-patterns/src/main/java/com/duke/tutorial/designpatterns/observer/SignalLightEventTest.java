package com.duke.tutorial.designpatterns.observer;

public class SignalLightEventTest {
    public static void main(String[] args) {
        SignalLight light = new SignalLight();//交通信号灯（事件源）
        light.addVehicleListener(new Car());  //注册监听器（轿车）
        light.addVehicleListener(new Buses());//注册监听器（公交车）
        light.changeColor("红色");
        System.out.println("------------");
        light.changeColor("绿色");
    }
}
