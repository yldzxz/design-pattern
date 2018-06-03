package operate;

/**
 * Created by hkz on 下午 8:59 2018/5/26 0026 .
 */
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        double result = 0;
        if(num2 == 0 ){
            try {
                throw new Exception("除数不能为0");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        result = num1 / num2;
        return result;
    }
}
