package com.hkz.abs;

/**
 * Created by hkz on  2018/6/15 0015 .
 */
//通知者
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void sendNotify(String message);


}
