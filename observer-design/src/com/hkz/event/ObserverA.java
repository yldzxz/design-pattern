package com.hkz.event;

/**
 * Created by hkz on  2018/6/17 0017 .
 */
/*
* 观察者1号，方法名A,
* */
public class ObserverA {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodA(){
        System.out.println("A：方法A执行");
    }
}
