package com.duke.tutorial.designpatterns.observer;

import java.util.EventObject;

/**
 * 信号灯颜色
 *
 * @author Cheri_Du
 */
public class SignalColor {
    private String color; //"红色"和"绿色"

    public SignalColor(Object source, String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
}
