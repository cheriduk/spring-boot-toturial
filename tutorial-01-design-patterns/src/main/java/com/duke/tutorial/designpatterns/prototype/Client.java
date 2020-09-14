package com.duke.tutorial.designpatterns.prototype;

public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(){
        //需要创建原型接口的对象
        Prototype copyPrototype = (Prototype) prototype.clone();
        System.out.println(copyPrototype);
    }

    public static void main(String[] args)  {
        ConcretePrototype1 concretePrototype1 = new ConcretePrototype1();
        Client client = new Client(concretePrototype1);
        client.operation();
    }
}
