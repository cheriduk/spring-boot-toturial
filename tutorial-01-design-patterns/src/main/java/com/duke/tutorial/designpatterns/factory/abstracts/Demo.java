package com.duke.tutorial.designpatterns.factory.abstracts;

import com.duke.tutorial.designpatterns.factory.method.AbstractFactory;
import com.duke.tutorial.designpatterns.factory.method.AppleFactory;
import com.duke.tutorial.designpatterns.factory.method.XiaoMiFactory;

public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        miFactory.makePC();                // make xiaomi PC!
        appleFactory.makePhone();        // make iphone!
        appleFactory.makePC();            // make MAC!
    }
}
