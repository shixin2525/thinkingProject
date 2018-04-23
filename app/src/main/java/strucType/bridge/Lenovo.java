package strucType.bridge;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/23.
 */

public class Lenovo implements Brand {
    @Override
    public void sale() {
        Log.e("tag","销售联想品牌电脑");
    }
}
