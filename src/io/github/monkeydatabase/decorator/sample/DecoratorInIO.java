package io.github.monkeydatabase.decorator.sample;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

public class DecoratorInIO {
//    //Component
//    InputStream;
//
//    //ConcreteComponent
//    FileInputStream;
//    StringBufferInputStream;
//    ByteInputStream;
//
//    //Decorator
//    FilterInputStream;
//
//    //ConcreteDecorator
//    BufferedInputStream;
//    DataInputStream;
//    LineNumberInputStream;
public static void main(String[] args) throws Exception {
    DataInputStream dis=new DataInputStream(new FileInputStream("D://233.txt"));
    System.out.println(dis.read());
}

}
