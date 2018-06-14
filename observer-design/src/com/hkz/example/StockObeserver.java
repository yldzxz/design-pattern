package com.hkz.example;

/**
 * Created by hkz on  2018/6/14 0014 .
 */
public class StockObeserver extends Observer {

    public StockObeserver(String name,Subject subject){
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println(subject.getState()+"关闭股票，继续工作"+name);
    }
}
