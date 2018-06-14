package com.hkz.example;

/**
 * Created by hkz on  2018/6/14 0014 .
 */
public class App {
    public static void main(String[] args) {
        Boss hu = new Boss();
        Observer observer1 = new StockObeserver("hkz",hu);
        Observer observer2 = new StockObeserver("hkz",hu);

        hu.attatch(observer1);
        hu.attatch(observer2);
        hu.detach(observer1);
        hu.setState("hello go ");
        hu.notifyObserver();
    }
}
