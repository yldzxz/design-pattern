package com.hkz.abs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hkz on  2018/6/15 0015 .
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observerList;

    private String message;

    public ConcreteSubject(){
        super();
        this.observerList = new ArrayList<Observer>();
    }
    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void sendNotify(String message) {
        System.out.println("通知者发送消息：" + message);
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).update(message);
        }
    }
    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
