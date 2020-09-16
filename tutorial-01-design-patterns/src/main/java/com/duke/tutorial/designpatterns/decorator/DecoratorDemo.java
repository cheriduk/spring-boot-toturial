package com.duke.tutorial.designpatterns.decorator;

/**
 * @author Cheri_Du
 */
public class DecoratorDemo {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 第一次修饰，比如，加鸡蛋，加1块
        component = new ConcreteDecorator(component);
        // 第二次修饰，比如，加烤肠，加2块
        component = new ConcreteDecorator(component);
        // 修饰后运行，将钱加在一起
        component.cost();
    }
}