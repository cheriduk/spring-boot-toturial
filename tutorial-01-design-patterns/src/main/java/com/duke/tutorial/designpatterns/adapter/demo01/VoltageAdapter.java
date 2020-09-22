package com.duke.tutorial.designpatterns.adapter.demo01;

/**
 * Adapter类：完成220V-5V的转变
 * <p>
 * 通过继承src类，实现 dst 类接口，完成src->dst的适配。
 * <p>
 * 由于 Java这种单继承的机制限制，所以类适配器需要继承src类这一点算是一个缺点
 * 因为这要求dst必须是接口，有一定局限性
 * 且src类的方法在Adapter中都会暴露出来，也增加了使用（最少知道原则）的成本，
 * 但同样由于其继承了src类，所以它可以根据需求重写src类的方法，使得Adapter的灵活性增强了。
 * <p>
 * 项目中不推荐使用
 */
public class VoltageAdapter extends Voltage220 implements Voltage5 {
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("适配器工作开始适配电压");
        int dst = src / 44;
        System.out.println("适配完成后输出电压：" + dst);
        return dst;
    }

    @Override
    public int output12V() {
        return 0;
    }
}
