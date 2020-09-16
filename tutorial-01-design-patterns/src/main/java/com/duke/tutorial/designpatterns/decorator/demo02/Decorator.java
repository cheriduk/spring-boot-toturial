package com.duke.tutorial.designpatterns.decorator.demo02;

/**
 * Created by noteless on 2018/9/6.
 * Description:装饰器类实现了手抓饼接口,具有了手抓饼的类型
 */
public abstract class Decorator implements HandPancake {
    private HandPancake handPancake;

    Decorator(HandPancake handPancake) {
        this.handPancake = handPancake;
    }

    /**
     * 提供手抓饼
     *
     * @return
     */
    @Override
    public String offerHandPancake() {
        return handPancake.offerHandPancake();
    }

    /**
     * 提供手抓饼的价格
     *
     * @return
     */
    @Override
    public Integer calcCost() {
        return handPancake.calcCost();
    }
}
