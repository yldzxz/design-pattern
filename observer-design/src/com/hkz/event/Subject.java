package com.hkz.event;

/**
 * Created by hkz on  2018/6/17 0017 .
 */
public abstract class Subject {
    protected  EventHander eventHander;

    public abstract void addEvent(Object o,String methodName, Object ...args);

    public abstract void removeEvent(Object o,String methodName, Object ...args);

    public abstract void  notifyE();
}
