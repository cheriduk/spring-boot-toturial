package com.duke.tutorial.designpatterns.delegate;

//后台代码
 public class CodeService implements BaseService {

    @Override
    public void execute() {
         System.out.println("执行后台代码开发任务");
    }

 }
