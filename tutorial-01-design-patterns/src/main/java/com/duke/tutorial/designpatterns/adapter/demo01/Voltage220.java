package com.duke.tutorial.designpatterns.adapter.demo01;

/**
 * 已有类src：现有的220V电压
 */
public class Voltage220 {
    public int output220V() {
        int src = 220;
        System.out.println("我是" + src + "V");
        return src;
    }
}
