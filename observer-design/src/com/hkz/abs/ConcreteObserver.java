package com.hkz.abs;

/**
 * Created by hkz on  2018/6/15 0015 .
 */
public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(this.name + "观察者收到消息"  + message);
    }


}
