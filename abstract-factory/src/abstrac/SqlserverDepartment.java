package abstrac;

/**
 * Created by hkz on  2018/6/20 0020 .
 */
public class SqlserverDepartment implements IDepartment {

    @Override
    public void insertDept(Department department) {
        System.out.println("在sql server中给depart增加一条记录" );
    }

    @Override
    public void getDepartment(int id) {
        System.out.println("在sql server中获取一条记录");
    }
}
