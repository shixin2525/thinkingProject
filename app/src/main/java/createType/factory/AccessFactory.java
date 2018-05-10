package createType.factory;

/**
 * Created by shixin-pc on 2018/5/9.
 */

public class AccessFactory implements  IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}
