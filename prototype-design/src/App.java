/**
 * Created by hkz on  2018/6/7 0007 .
 */
public class App {
    public static void main(String[] args) {
        App app = new App();
        app.test1();
        app.test2();
    }
    //浅复制测试
    public void test1(){
        Resume resume1 = new Resume();
        resume1.setName("hkz");
        resume1.setAge("20");
        resume1.setSex("mm");
        resume1.setTimeArea("1");
        resume1.setWorkExperience(new WorkExperience("2018","yy"));

        Resume resume2 = resume1.clone();
        resume2.setName("hkz2");

        Resume resume3 = resume1.clone();
        resume3.setName("hkz3");

        System.out.println(resume1.toString());
        System.out.println(resume2.toString());
        System.out.println(resume3.toString());
        System.out.println(resume1 == resume3);
        System.out.println(resume1 == resume2);
        System.out.println(resume1.getWorkExperience() == resume2.getWorkExperience());
    }

    //深复制测试
    public void test2(){
        ResumeDe resume1 = new ResumeDe();
        resume1.setName("hkz");
        resume1.setAge("20");
        resume1.setSex("mm");
        resume1.setTimeArea("1");
        resume1.setWorkExperience(new WorkExperience("2018","yy"));

        ResumeDe resume2 = resume1.clone();
        resume2.setName("hkz2");

        ResumeDe resume3 = resume1.clone();
        resume3.setName("hkz3");

        System.out.println(resume1.toString());
        System.out.println(resume2.toString());
        System.out.println(resume3.toString());
        System.out.println(resume1 == resume3);
        System.out.println(resume1 == resume2);
        System.out.println(resume1.getWorkExperience() == resume2.getWorkExperience());

    }


}
