package com.duke.tutorial.designpatterns.decorator;

/**
 * @author Cheri_Du
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component){
        super(component);
    }

    // 定义自己的修饰逻辑
    private void decorateMethod1(){
        System.out.println("定义自己的修饰前置逻辑");
    }

    // 重写父类的方法
    @Override
    public void cost(){
        this.decorateMethod1();
        super.cost();
        this.decorateMethod2();
    }

    // 定义自己的修饰逻辑
    private void decorateMethod2(){
        System.out.println("定义自己的修饰后置逻辑");
    }
}
