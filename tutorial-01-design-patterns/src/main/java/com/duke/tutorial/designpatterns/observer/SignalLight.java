package com.duke.tutorial.designpatterns.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
// 目标类：事件源，交通信号灯

public class SignalLight {
    private List<Vehicle> listener; //监听器容器

    public SignalLight() {
        listener = new ArrayList<Vehicle>();
    }

    //给事件源绑定监听器
    public void addVehicleListener(Vehicle vehicle) {
        listener.add(vehicle);
    }

    //事件触发器：信号灯改变颜色。
    public void changeColor(String color) {
        System.out.println(color + "信号灯亮...");
        SignalColor event = new SignalColor(this, color);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }

    //当事件发生时,通知绑定在该事件源上的所有监听器做出反应（调用事件处理方法）
    protected void notifies(SignalColor e) {
        Vehicle vehicle = null;
        Iterator<Vehicle> iterator = listener.iterator();
        while (iterator.hasNext()) {
            vehicle = iterator.next();
            vehicle.see(e);
        }
    }
}
