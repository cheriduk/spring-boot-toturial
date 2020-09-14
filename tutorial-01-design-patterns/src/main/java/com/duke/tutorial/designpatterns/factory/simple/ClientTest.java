package com.duke.tutorial.designpatterns.factory.simple;

import org.apache.commons.logging.LogFactory;

public class ClientTest {
    public static void main(String[] args) {
        CourseSimpleFactory simpleFactory = new CourseSimpleFactory();
        ICourse iCourse = simpleFactory.createCourse("Java");
        iCourse.record();

//        LogFactory.getLog()
    }
}
