/**
 * Created by hkz on  2018/6/12 0012 .
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    SubSystemThree subSystemThree;

    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemThree = new SubSystemThree();
        subSystemTwo = new SubSystemTwo();
    }

    public void methodA(){
        System.out.println("方法A");
        subSystemThree.methodThree();
        subSystemTwo.methodTwo();
        subSystemOne.methodOne();
    }
    public void methodB(){
        System.out.println("方法B");
        subSystemTwo.methodTwo();
        subSystemOne.methodOne();
    }

}
