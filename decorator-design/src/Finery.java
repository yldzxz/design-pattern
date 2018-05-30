/**
 * Created by hkz on 下午 10:39 2018/5/30 0030 .
 */
public class Finery extends Person{

    protected  Person person;

    public void decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        person.show();
    }

}
