/**
 * Created by hkz on 下午 10:35 2018/5/30 0030 .
 */
//具体装饰类
public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
    public Person(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name + "start show ");
    }
}
