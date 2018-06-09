package behavior.state;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 下午的状态
 */

public class AfternoonState implements  State {
    @Override
    public void doSomeThing() {
        Log.e("tag","下午学习");
    }
}
