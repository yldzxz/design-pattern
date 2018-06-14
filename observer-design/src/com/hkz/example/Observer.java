package com.hkz.example;

/**
 * Created by hkz on  2018/6/14 0014 .
 */
public abstract class Observer {

    protected String name;

    protected   Subject subject;

    public abstract void update();
}
