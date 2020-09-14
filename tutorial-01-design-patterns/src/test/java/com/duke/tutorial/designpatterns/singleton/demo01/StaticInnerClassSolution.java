package com.duke.tutorial.designpatterns.singleton.demo01;

public class StaticInnerClassSolution {
    private static class InnerClass {
        private static StaticInnerClassSolution staticInnerClass = new StaticInnerClassSolution();
    }

    public static StaticInnerClassSolution getInstance() {
        return InnerClass.staticInnerClass;
    }

    private StaticInnerClassSolution() {
        //构造器判断，防止反射攻击，大家可以在下面这行if判断打断点来测试一下这个方法的过程，
        if (InnerClass.staticInnerClass != null) {
            throw new IllegalStateException();
        }
    }

}
