package com.duke.tutorial.designpatterns.adapter.demo01;

public class ClientTest {

    public static void main(String[] args) {
        VoltageAdapter adapter = new VoltageAdapter();
        int distV  = adapter.output5V();
        System.out.println("最终输出电压 =============> "+distV);
    }

}
