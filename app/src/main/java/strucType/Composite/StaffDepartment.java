package strucType.Composite;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/21.
 * 所有员工部门
 */

public class StaffDepartment extends  Company{
    public StaffDepartment(String name) {
        super(name);
    }
    @Override
    public void show() {
    Log.e("tag",getName());
    }

    @Override
    public void responsibility() {
      Log.e("tag",getName()+"职责是所有公司任务");
    }


    @Override
    public void add(Company c) {

    }

    @Override
    public void remote(Company c) {

    }
}
