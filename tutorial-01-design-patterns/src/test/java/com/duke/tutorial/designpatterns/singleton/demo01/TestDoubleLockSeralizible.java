package com.duke.tutorial.designpatterns.singleton.demo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestDoubleLockSeralizible {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DoubleLock doubleLock = DoubleLock.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doubleLock_obj"));
        oos.writeObject(doubleLock);

        File file = new File("doubleLock_obj");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        DoubleLock newDoubleLock = (DoubleLock) ois.readObject();

        System.out.println(doubleLock);
        System.out.println(newDoubleLock);
        System.out.println(doubleLock == newDoubleLock);
    }
}
