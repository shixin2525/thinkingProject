package strucType.bridge;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/23.
 */

public class Dell implements  Brand {
    @Override
    public void sale() {
        Log.e("tag","销售DELL品牌电脑");
    }
}
