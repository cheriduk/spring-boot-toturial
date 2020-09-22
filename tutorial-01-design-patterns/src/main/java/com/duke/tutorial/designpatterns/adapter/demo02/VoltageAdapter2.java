package com.duke.tutorial.designpatterns.adapter.demo02;

import com.duke.tutorial.designpatterns.adapter.demo01.Voltage220;
import com.duke.tutorial.designpatterns.adapter.demo01.Voltage5;

/**
 * 持有 src类，实现 dist 类接口，完成src->dist的适配。 。以达到解决**兼容性**的问题。
 */
public class VoltageAdapter2 implements Voltage5 {
    private Voltage220 mVoltage220;

    public VoltageAdapter2(Voltage220 voltage220) {
        mVoltage220 = voltage220;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != mVoltage220) {
            int src = mVoltage220.output220V();
            System.out.println("对象适配器工作，开始适配电压");
            dst = src / 44;
            System.out.println("适配完成后输出电压：" + dst);
        }
        return dst;
    }

    @Override
    public int output12V() {
        return 0;
    }
}
