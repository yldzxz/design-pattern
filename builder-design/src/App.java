/**
 * Created by hkz on  2018/6/13 0013 .
 */
public class App {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder1 = new ConcreteBuilder1();
        Builder builder2 = new ConcreteBuilder2();

        director.build(builder1);
        Product p1 = builder1.getResult();
        p1.show();

        director.build(builder2);
        Product p2 = builder2.getResult();
        p2.show();

    }
}
