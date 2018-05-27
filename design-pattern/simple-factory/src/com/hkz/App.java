package com.hkz;

/**
 * Created by hkz on 下午 9:19 2018/5/26 0026 .
 */
public class App {
    public static void main(String[] args) {
        Operation operation  = OperationFactory.createOperate("+");
        double num1 = 1;
        double num2 = 2;
        operation.setNum1(num1);
        operation.setNum2(num2);

        double result = operation.getResult();
        System.out.println(result);
    }
}
