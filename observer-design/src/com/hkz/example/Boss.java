package com.hkz.example;

import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hkz on  2018/6/14 0014 .
 */
public class Boss extends Subject{

    private String name;

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attatch(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
