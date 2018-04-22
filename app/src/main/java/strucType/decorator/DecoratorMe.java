package strucType.decorator;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/22.
 */

public class DecoratorMe implements AbstractPerson {

    @Override
    public void show() {
      Log.e("tag","我");
    }
}
