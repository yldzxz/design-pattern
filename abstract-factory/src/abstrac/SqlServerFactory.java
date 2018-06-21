package abstrac;

/**
 * Created by hkz on  2018/6/21 0021 .
 */
public class SqlServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
