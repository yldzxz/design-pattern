package simple.abs;

/**
 * Created by hkz on  2018/6/21 0021 .
 */
public class AccessUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("在access中给user增加一条记录");
    }

    @Override
    public void getUser(int id) {
        System.out.println("在access中获取一条记录");
    }
}
