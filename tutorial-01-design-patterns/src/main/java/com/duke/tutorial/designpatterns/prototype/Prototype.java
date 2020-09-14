package com.duke.tutorial.designpatterns.prototype;

/**
 * 原型模式属于对象的创建模式。通过给出一个<>原型对象</>来指明所有创建的对象的类型，
 * 然后用<>复制</>这个原型对象的办法创建出更多同类型的对象。
 * 无须再去通过new来创建，这就是选型模式的用意。
 *
 */
public interface Prototype {
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Object clone();
}


