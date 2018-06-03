import factory.AddFactory;
import factory.IFactory;
import operate.Operation;

/**
 * Created by hkz on 下午 10:30 2018/6/1 0001 .
 */
public class App {
    public static void main(String[] args) {
        IFactory factory = new AddFactory();
        Operation operation = factory.createOperation();
        operation.setNum1(1);
        operation.setNum2(2);
        System.out.println(operation.getResult());

    }
}
