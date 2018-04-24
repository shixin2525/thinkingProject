package strucType.proxy;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/24.
 */

public class ByAgent implements  Give{
    @Override
    public void flower() {
        Log.e("tag","送花");
    }
}
