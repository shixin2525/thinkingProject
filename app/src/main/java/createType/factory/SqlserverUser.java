package createType.factory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/5/9.
 */

public class SqlserverUser implements  IUser{
 public void insert(User user){
     Log.e("tag","SqlserverUser增加一条用户数据");
 }

 public void getUser(){
     Log.e("tag","SqlserverUser获取一条用户数据");
 }
}
