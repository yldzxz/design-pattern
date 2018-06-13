/**
 * Created by hkz on  2018/6/13 0013 .
 */
public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件A");
    }

    @Override
    public void buildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }


}
