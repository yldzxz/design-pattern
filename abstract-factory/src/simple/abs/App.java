package simple.abs;

/**
 * Created by hkz on  2018/6/24 0024 .
 */
public class App {
    public static void main(String[] args) {
        DataAccess ds = new DataAccess();
        IUser userDao = ds.createUser();
        userDao.getUser(1);
        userDao.insertUser(new User());
    }
}
