package com.hkz.event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hkz on  2018/6/17 0017 .
 */
//事件处理者
public class EventHander {
    private List<Event> eventList;

    public EventHander(){
        eventList = new ArrayList<Event>();
    }
    /**
     *
    * @Param  object 观察者对象
     * @Param method 观察者的更新方法
     * @Param args 方法的参数
    * */
    public void addEvent(Object object,String method,Object...args){
        this.eventList.add(new Event(object,method,args));
    }
    //删除事件
    public void removeEvent(Object object,String method,Object...args){
        Event event = new Event(object,method,args);
        for (int i = 0; i < eventList.size(); i++) {
            if(eventList.get(i).equals(event)){
                eventList.remove(i);
                break;
            }
        }
    }
    //通知
    public void notifyE() throws Exception {
        for (Event e : eventList){
            e.invoke();
        }
    }
}
