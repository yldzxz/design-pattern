/**
 * Created by hkz on  2018/6/5 0005 .
 */
public class Resume implements Cloneable{

    private String name;

    private String sex;

    private String age;

    private String timeArea;

    private WorkExperience workExperience;



    public WorkExperience getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(WorkExperience workExperience) {
        this.workExperience = workExperience;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Resume clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (Resume) obj;
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持克隆");
            return null;
        }
    }
    @Override
    public String toString() {
        return "Resume{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", timeArea='" + timeArea + '\'' +
                ", workExperience=" + workExperience +
                '}';
    }

}
