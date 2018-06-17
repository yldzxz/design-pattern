package com.hkz.event;

/**
 * Created by hkz on  2018/6/17 0017 .
 */
public class App {
    public static void main(String[] args) {

        Subject subject = new MySubject();
        ObserverA a = new ObserverA();
        ObserverB b = new ObserverB();
        ObserverC c = new ObserverC();

        subject.addEvent(a,"methodA");
        subject.addEvent(b,"methodB");
        subject.addEvent(c,"methodC");

        subject.notifyE();

        subject.removeEvent(c,"methodC");
        subject.notifyE();
    }
}
