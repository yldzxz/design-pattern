package abstrac;

/**
 * Created by hkz on  2018/6/21 0021 .
 */
public class AccessDepartment implements IDepartment{

    @Override
    public void insertDept(Department department) {
        System.out.println("在access中给user增加一条记录");
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("在access中获取一条记录");
    }
}
