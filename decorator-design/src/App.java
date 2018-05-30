/**
 * Created by hkz on 下午 10:45 2018/5/30 0030 .
 */
public class App {

    public static void main(String[] args) {
        Person person = new Person("hkz");

        TShirts tShirts = new TShirts();
        BigTrouser xt = new BigTrouser();
        Sneakers sk = new Sneakers();

        System.out.println("第一种装扮");
        tShirts.decorate(person);
        xt.decorate(tShirts);
        sk.decorate(xt);
        sk.show();

    }
}
