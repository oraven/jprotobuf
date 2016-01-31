package com.baidu.bjf.remoting.protobuf.codechange;

import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;

/**
 * Created by yuanqi on 2015/10/15.
 */
public class Person {

    @Protobuf(required = true, order = 1)
    public int id;
    @Protobuf(required = true, order = 2)
    public String name;

    public Person() {

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
