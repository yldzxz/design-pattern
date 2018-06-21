package abstrac;

/**
 * Created by hkz on  2018/6/20 0020 .
 */
public class SqlserverUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("在sql server中给user增加一条记录" );
    }

    @Override
    public void getUser(int id) {
        System.out.println("在sql server中获取一条记录");
    }
}
