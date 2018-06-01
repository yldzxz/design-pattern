/**
 * Created by hkz on 下午 9:50 2018/6/1 0001 .
 */
public class Proxy implements IGiveGift{

    private Pursuit pursuit;

    public Proxy(ShoolGirl shoolGirl){
        this.pursuit = new Pursuit(shoolGirl);
    }

    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
