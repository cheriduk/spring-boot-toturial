package com.duke.tutorial.designpatterns.adapter.demo01;

/**
 * 目标类dist：需要5V电压
 */
public interface Voltage5 {
    int output5V();

    int output12V();
}
