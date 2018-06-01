/**
 * Created by hkz on 下午 9:53 2018/6/1 0001 .
 */
public class App {
    public static void main(String[] args) {

        ShoolGirl klt = new ShoolGirl();
        klt.setName("klt");
        Proxy proxy = new Proxy(klt);
        proxy.giveDoll();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
