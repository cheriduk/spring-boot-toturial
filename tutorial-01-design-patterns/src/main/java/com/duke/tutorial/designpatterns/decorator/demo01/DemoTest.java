package com.duke.tutorial.designpatterns.decorator.demo01;

public class DemoTest {
    public static void main(String[] args) {
        Apple apple =new ConcreteApple();
        System.out.println("-----------未装饰-------------------\n");
        apple.res();//原来的方法
        System.out.println("包装层：="+apple.layer());
        System.out.println("------------------------------------\n");
        test2(apple) ;
    }
    private static void test2(Apple apple){
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(apple);
        System.out.println("\n-----------装饰后-------------------\n");
        decoratorB.res();
        System.out.println("包装层：="+decoratorB.layer());
        System.out.println("------------------------------");

        ConcreteDecoratorB decoratora = new ConcreteDecoratorB(decoratorB);
        decoratora.res();
        System.out.println("包装层：="+decoratora.layer());;
    }
}
