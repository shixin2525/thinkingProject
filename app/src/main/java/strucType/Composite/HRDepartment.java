package strucType.Composite;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/21.
 * HR部门
 */

public class HRDepartment extends  Company{
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {

    }

    @Override
    public void remote(Company c) {

    }

    @Override
    public void show() {
        Log.e("tag", getName());
    }

    @Override
    public void responsibility() {
        Log.e("tag", getName()+"职责是负责所有人事工作");
    }
}
