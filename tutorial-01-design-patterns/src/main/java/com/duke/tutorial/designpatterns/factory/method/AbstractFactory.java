package com.duke.tutorial.designpatterns.factory.method;

import com.duke.tutorial.designpatterns.factory.abstracts.PC;
import com.duke.tutorial.designpatterns.factory.simple.demo.Phone;

public interface AbstractFactory {
    Phone makePhone();

    PC makePC();
}
