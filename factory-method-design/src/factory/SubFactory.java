package factory;

import operate.Operation;
import operate.OperationAdd;
import operate.OperationSub;

/**
 * Created by hkz on 下午 11:02 2018/6/3 0003 .
 */
public class SubFactory implements IFactory{
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
