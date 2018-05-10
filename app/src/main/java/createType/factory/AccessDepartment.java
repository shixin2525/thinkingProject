package createType.factory;

import android.util.Log;

/**
 * Created by LSX on 2018/5/10.
 */

public class AccessDepartment implements  IDepartment{
    public void insert(Department user){
        Log.e("tag","AccessDepartment增加一条用户数据");
    }

    public void getUser(){
        Log.e("tag","AccessDepartment获取一条用户数据");
    }
}
