import java.util.ArrayList;
import java.util.List;

/**
 * Created by hkz on  2018/6/13 0013 .
 * 产品类，由多个部件组成
 */
public class Product {

    List<String> list = new ArrayList<String>();

    public void add(String part){
        list.add(part);
    }

    public void show(){
        System.out.println("创建");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
