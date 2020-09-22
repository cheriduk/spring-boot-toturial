package com.duke.tutorial.designpatterns.adapter.demo03;

public class VoltageAdapter3 extends DefaultVoltage5Adapter {
    @Override
    public int output5V() {
        int dst = 0;
        if (null != super.mVoltage220) {
            int src = mVoltage220.output220V();
            System.out.println("对象适配器工作，开始适配电压");
            dst = src / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;
    }
}
