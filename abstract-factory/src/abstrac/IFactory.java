package abstrac;

/**
 * Created by hkz on  2018/6/21 0021 .
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
