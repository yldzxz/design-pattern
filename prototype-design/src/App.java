/**
 * Created by hkz on  2018/6/7 0007 .
 */
public class App {
    public static void main(String[] args) {
        //浅复制
        Resume resume1 = new Resume();
        resume1.setName("hkz");
        resume1.setAge("20");
        resume1.setSex("mm");
        resume1.setTimeArea("1");

        Resume resume2 = resume1.clone();
        resume2.setName("hkz2");

        Resume resume3 = resume1.clone();
        resume3.setName("hkz3");

        System.out.println(resume1.toString());
        System.out.println(resume2.toString());
        System.out.println(resume3.toString());
        System.out.println(resume1 == resume3);
        System.out.println(resume1 == resume2);


    }
}
