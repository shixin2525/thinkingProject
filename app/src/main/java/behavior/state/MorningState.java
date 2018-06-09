package behavior.state;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 早上的状态
 */

public class MorningState implements  State {
    @Override
    public void doSomeThing() {
        Log.e("tag","早上睡觉");
    }
}
