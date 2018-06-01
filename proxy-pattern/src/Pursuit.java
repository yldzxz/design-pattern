/**
 * Created by hkz on 下午 9:43 2018/6/1 0001 .
 */
public class Pursuit implements  IGiveGift{

    private ShoolGirl sg;

    public Pursuit(ShoolGirl sg){
        this.sg = sg;
    }

    @Override
    public void giveDoll() {
        System.out.println("give doll " + sg.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println("give flowers " + sg.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("give chocolate " + sg.getName());
    }
}
