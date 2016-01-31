package com.baidu.bjf.remoting.protobuf.codechange;

import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;

import java.io.IOException;

/**
 * Created by yuanqi on 2015/10/15.
 */
public class DecodeTest {

    public static void main(String[] args) {
        Person person = new Person(1, "中文好啊好");
        Object object = person;
        byte[] bytes = new byte[1000];
        Codec codec = ProtobufProxy.create(object.getClass());
        try {
            int size = codec.size(object);
            codec.encode(object, bytes, 0, size);
            Person newPerson = (Person) codec.decode(bytes, 0, size);
            System.out.println(newPerson.name);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
