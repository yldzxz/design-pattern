package com.hkz.abs;

/**
 * Created by hkz on  2018/6/15 0015 .
 */
public class App {
    public static void main(String[] args) {
        Observer observer1 = new ConcreteObserver("hkz1");
        Observer observer2 = new ConcreteObserver("hkz2");
        Observer observer3 = new ConcreteObserver("hkz3");

        Subject subject = new ConcreteSubject();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.sendNotify("来了");

        subject.removeObserver(observer3);
        subject.sendNotify("走了");

    }
}
