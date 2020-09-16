package com.duke.tutorial.designpatterns.decorator.demo02;

/**
 * @author Cheri_Du
 */
public interface HandPancake {
    /**
     * 提供手抓饼
     */
    String offerHandPancake();
    /**计算手抓饼的价格
     * @return
     */
    Integer calcCost();
}
