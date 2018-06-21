package abstrac;

/**
 * Created by hkz on  2018/6/21 0021 .
 */
public class App {
    public static void main(String[] args) {
//        IFactory factory = new SqlServerFactory();
        IFactory factory = new AccessFactory();
        IDepartment department = factory.createDepartment();
        IUser iUser = factory.createUser();

        iUser.getUser(1);
        department.getDepartment(1);
    }
}
