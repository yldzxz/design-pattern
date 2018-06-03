package factory;

import operate.Operation;
import operate.OperationAdd;
import operate.OperationMul;

/**
 * Created by hkz on 下午 11:02 2018/6/3 0003 .
 */
public class MulFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
