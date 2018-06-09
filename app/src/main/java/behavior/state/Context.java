package behavior.state;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 状态转换类
 */

public class Context {
 public void setState(State state){
     Log.e("tag","状态改变");
     state.doSomeThing();
 }
}
