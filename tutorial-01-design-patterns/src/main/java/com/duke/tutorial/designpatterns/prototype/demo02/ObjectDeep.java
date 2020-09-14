package com.duke.tutorial.designpatterns.prototype.demo02;

import java.io.*;

/**
 * 这样做的前提就是对象以及对象内部所有引用到的对象都是可序列化的，
 * 否则，就需要仔细考察那些不可序列化的对象可否设成transient，从而将之排除在复制过程之外。
 */
public class ObjectDeep {
    public  Object deepClone() throws IOException, ClassNotFoundException{
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();

    }
}
