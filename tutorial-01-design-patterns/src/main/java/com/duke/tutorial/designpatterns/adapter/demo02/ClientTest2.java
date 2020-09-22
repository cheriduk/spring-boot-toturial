package com.duke.tutorial.designpatterns.adapter.demo02;

import com.duke.tutorial.designpatterns.adapter.demo01.Voltage220;

public class ClientTest2 {

    public static void main(String[] args) {
        Voltage220 voltage220 = new Voltage220();
        VoltageAdapter2 adapter = new VoltageAdapter2(voltage220);
        int distV = adapter.output5V();
        System.out.println("最终输出电压 =============> " + distV);
    }

}
