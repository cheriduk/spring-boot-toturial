package com.duke.tutorial.designpatterns.delegate;

import java.util.HashMap;
import java.util.Map;

//委派任务角色
public class Delegator {
    // 用一个容器存放不同的子任务对应的执行对象
    Map<String, BaseService> map = new HashMap<>();

   // 任务的委派，分发
    private BaseService delegate(String msg) {
        map.put("前端", new FrontService());
        map.put("后台", new CodeService());
      if ("后台".equals(msg)) {
            return map.get(msg);
         } else if ("前端".equals(msg)) {
            return map.get(msg);
        }
        System.out.println("委派任务出错！");
        return null;
     }

     // 任务具体的执行
     public void execute(String msg) {
        if (delegate(msg)!=null) {
           delegate(msg).execute();
        }
    }

 }
