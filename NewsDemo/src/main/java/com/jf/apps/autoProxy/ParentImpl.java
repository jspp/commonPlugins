package com.jf.apps.autoProxy;

import java.io.Serializable;

/**
 * ouyangjie
 * 2019/1/12
 * 16:00
 */
public class ParentImpl<T> implements ParentInterface<T> {

    @Override
    public T sayhello(T name) {
        System.out.println( "你好" + name);
        return name;
    }
}
