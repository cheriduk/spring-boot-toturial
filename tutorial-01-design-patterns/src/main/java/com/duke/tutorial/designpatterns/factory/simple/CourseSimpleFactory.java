package com.duke.tutorial.designpatterns.factory.simple;

public class CourseSimpleFactory {
    public ICourse createCourse(String courseName) {
        ICourse iCourse = null;
        switch (courseName) {
            case "Java":
                iCourse = new JavaCourse();
                break;
            case "Python":
                iCourse = new PythonCourse();
        }
        return iCourse;
    }
}
