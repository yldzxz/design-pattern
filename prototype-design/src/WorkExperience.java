/**
 * Created by hkz on  2018/6/7 0007 .
 */
public class WorkExperience implements Cloneable{

    private String workDate;

    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    protected  WorkExperience clone(){
        try {
            WorkExperience workExperience = (WorkExperience) super.clone();
            return  workExperience;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public WorkExperience(String workDate, String company) {
        this.workDate = workDate;
        this.company = company;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "workDate='" + workDate + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
