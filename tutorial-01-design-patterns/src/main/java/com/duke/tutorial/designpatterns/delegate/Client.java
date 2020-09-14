package com.duke.tutorial.designpatterns.delegate;

//客户端 ->委派任务
public class Client {

   public static void main(String[] args) {
        String command1 = "前端";
        String command2 = "后台";
        Delegator delegator = new Delegator();
        delegator.execute(command1);
        delegator.execute(command2);
        delegator.execute("test");
    }
 }
