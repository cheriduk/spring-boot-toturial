package com.duke.tutorial.designpatterns.adapter.demo03;

import com.duke.tutorial.designpatterns.adapter.demo01.Voltage220;
import com.duke.tutorial.designpatterns.adapter.demo01.Voltage5;

public abstract class DefaultVoltage5Adapter implements Voltage5 {
    protected Voltage220 mVoltage220;

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output12V() {
        return 0;
    }
}
