package createType.factory;

/**
 * Created by shixin-pc on 2018/5/9.
 */

public class SqlServerFactory implements  IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }


}
