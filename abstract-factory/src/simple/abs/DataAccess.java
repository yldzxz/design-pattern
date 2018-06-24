package simple.abs;

/**
 * Created by hkz on  2018/6/24 0024 .
 */
public class DataAccess {

    private static String db = "sqlServer";
//    private static String db = "access";
    public IUser createUser(){
        IUser iUser = null;
        switch (db){
            case "sqlServer": iUser = new SqlserverUser();
            break;
            case "access" : iUser = new AccessUser();
        }
        return iUser;
    }
}
