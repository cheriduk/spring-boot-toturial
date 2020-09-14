package com.duke.tutorial.designpatterns.factory.method;

import com.duke.tutorial.designpatterns.factory.abstracts.MAC;
import com.duke.tutorial.designpatterns.factory.abstracts.MiPC;
import com.duke.tutorial.designpatterns.factory.abstracts.PC;
import com.duke.tutorial.designpatterns.factory.simple.demo.MiPhone;
import com.duke.tutorial.designpatterns.factory.simple.demo.Phone;

public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}
