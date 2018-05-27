package com.hkz;

/**
 * Created by hkz on 2018/5/26 0026.
 */
public class OperationFactory {

    public static Operation createOperate(String operate){
        Operation operation = null;
        switch (operate){
            case ("+") :
                operation = new OperationAdd();
                break;
            case ("-") :
                operation = new OperationSub();
                break;
            case ("*") :
                operation = new OperationMul();
                break;
            case ("/") :
                operation = new OperationDiv();
                break;
        }

        return  operation;
    }

}
