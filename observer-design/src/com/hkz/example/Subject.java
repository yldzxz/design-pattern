package com.hkz.example;

/**
 * Created by hkz on  2018/6/14 0014 .
 */
//通知者接口
public abstract class Subject {


    protected String state;

    abstract void attatch(Observer observer);

    abstract void detach(Observer observer);

    abstract void notifyObserver();

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
