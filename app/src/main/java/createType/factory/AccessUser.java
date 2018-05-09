package createType.factory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/5/9.
 */

public class AccessUser implements  IUser{
    public void insert(User user){
        Log.e("tag","AccessUser增加一条用户数据");
    }

    public void getUser(){
        Log.e("tag","AccessUser获取一条用户数据");
    }
}
