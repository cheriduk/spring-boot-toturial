package com.duke.tutorial.designpatterns.delegate;

//前台页面
public class FrontService implements BaseService {

      @Override
      public void execute() {
          System.out.println("执行前端页面设计任务");
      }
 }
