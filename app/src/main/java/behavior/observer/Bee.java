package behavior.observer;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/8.
 * 蜜蜂类
 */

public class Bee implements  Insect {

    @Override
    public void work() {
      Log.e("tag","蜜蜂采蜜");
    }

    @Override
    public void unWork() {
        Log.e("tag","蜜蜂回巢");
    }
}
