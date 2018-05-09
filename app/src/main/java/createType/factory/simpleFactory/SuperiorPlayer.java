package createType.factory.simpleFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/5/7.
 * 我是大神
 */

public class SuperiorPlayer implements  Level{
    @Override
    public void userLevel() {
        Log.e("tag","直接去大厅");
    }
}
