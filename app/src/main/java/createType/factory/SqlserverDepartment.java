package createType.factory;

import android.util.Log;

/**
 * Created by LSX on 2018/5/10.
 */

public class SqlserverDepartment implements  IDepartment{
    public void insert(Department user){
        Log.e("tag","SqlserverDepartment增加一条用户数据");
    }

    public void getUser(){
        Log.e("tag","SqlserverDepartment获取一条用户数据");
    }
}
