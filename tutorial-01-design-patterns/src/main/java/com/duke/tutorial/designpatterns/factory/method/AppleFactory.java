package com.duke.tutorial.designpatterns.factory.method;

import com.duke.tutorial.designpatterns.factory.abstracts.MAC;
import com.duke.tutorial.designpatterns.factory.abstracts.MiPC;
import com.duke.tutorial.designpatterns.factory.abstracts.PC;
import com.duke.tutorial.designpatterns.factory.simple.demo.IPhone;
import com.duke.tutorial.designpatterns.factory.simple.demo.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new MAC();
    }
}
