package com.duke.tutorial.designpatterns.factory.simple;

public class PythonCourse implements ICourse{
    @Override
    public void record() {
        System.out.println("录制Java课程");
    }
}
