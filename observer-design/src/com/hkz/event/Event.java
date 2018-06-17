package com.hkz.event;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by hkz on  2018/6/17 0017 .
 */
public class Event {
    //执行方法的对象
    private Object object;
    //执行方法的名称
    private String methodName;
    //执行方法参数
    private Object[] params;
    //执行方法的参数类型
    private Class[] paramType;

    public Event(){

    }

    public Event(Object object, String methodName, Object[] params, Class[] paramType) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        this.paramType = paramType;
    }

    public Event(Object object,String methodName,Object...args){
        this.object=object;
        this.methodName=methodName;
        this.params=args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        this.paramType = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramType[i] = params[i].getClass();
        }
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamType() {
        return paramType;
    }

    public void setParamType(Class[] paramType) {
        this.paramType = paramType;
    }

    public void invoke() throws Exception{
        Method method  = this.object.getClass().getMethod(this.methodName,this.getParamType());
        if (method == null){
            return;
        }
        method.invoke(this.object,this.params);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (!object.equals(event.object)) return false;
        if (!methodName.equals(event.methodName)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(params, event.params)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(paramType, event.paramType);
    }

    @Override
    public int hashCode() {
        int result = object.hashCode();
        result = 31 * result + methodName.hashCode();
        result = 31 * result + Arrays.hashCode(params);
        result = 31 * result + Arrays.hashCode(paramType);
        return result;
    }
}
