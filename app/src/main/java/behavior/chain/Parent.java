package behavior.chain;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体处理者类（父母）
 *
 */

public class Parent extends   Handler {
    @Override
    public void handlerRequest(String str, int money) {
       if(money>100){
        Log.e("tag","处理请求");
       }else {
           Log.e("tag","不处理");
       }
    }
}
