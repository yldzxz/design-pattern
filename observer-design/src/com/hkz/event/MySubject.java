package com.hkz.event;

/**
 * Created by hkz on  2018/6/17 0017 .
 */
public class MySubject extends Subject{

    public MySubject(){
        eventHander = new EventHander();
    }

    //增加观察的对象，对象方法
    @Override
    public void addEvent(Object o, String methodName, Object ... args){
        eventHander.addEvent(o,methodName,args);
    }
    //删除对象
    @Override
    public void removeEvent(Object o,String methodName, Object ...args){
        eventHander.removeEvent(o,methodName,args);
    }

    //通知
    @Override
    public void notifyE() {
        System.out.println("通知者：开始通知对象");
        try {
            eventHander.notifyE();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
