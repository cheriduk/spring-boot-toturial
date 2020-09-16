package com.duke.tutorial.designpatterns.decorator.demo02;

/**
 * 手抓饼3块
 * Sausage 烤肠 3块
 * Bacon 培根 4块
 * Egg 鸡蛋2块
 * Vegetable 青菜 1块
 *
 * @author Cheri_Du
 */
public class DemoTest {
    public static void main(String... strings) {

        //有一个顾客张三,他想吃手抓饼了,来了一个原味的
        Customer customerA = new Customer("张三");
        customerA.buy(new NotelessHandPancake());

        //有一个顾客李四,他想吃手抓饼了,他加了一根烤肠
        Customer customerB = new Customer("李四");
        customerB.buy(new Sausage(new NotelessHandPancake()));

        //有一个顾客王五,他想吃手抓饼了,他加了一根烤肠 又加了培根
        Customer customerC = new Customer("王五");
        customerC.buy(new Bacon(new Sausage(new NotelessHandPancake())));

        //有一个顾客王五的兄弟,他想吃手抓饼了,他加了培根 又加了烤肠
        Customer customerC1 = new Customer("王五的兄弟");
        customerC1.buy(new Sausage(new Bacon(new NotelessHandPancake())));

        //有一个顾客赵六,他想吃手抓饼了,他加了一根烤肠 又加了2份培根
        Customer customerD = new Customer("赵六");
        customerD.buy(new Bacon(new Bacon(new Sausage(new NotelessHandPancake()))));

        //有一个顾客 王二麻子,他想吃手抓饼了,特别喜欢吃青菜 来了三分青菜
        Customer customerE = new Customer("王二麻子");
        customerE.buy(new Vegetable(new Vegetable(new Vegetable(new NotelessHandPancake()))));

        //有一个顾客 有钱人 王大富 来了一个全套的手抓饼
        Customer customerF = new Customer("王大富");
        customerF.buy(new Egg(new Vegetable(new Bacon(new Sausage(new NotelessHandPancake())))));
    }
}
