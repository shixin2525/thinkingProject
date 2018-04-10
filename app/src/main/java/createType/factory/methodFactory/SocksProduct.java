package createType.factory.methodFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/10.
 * 国产袜子产品
 */
public class SocksProduct implements Socks {
    @Override
    public void make() {
        Log.e("tag","生产100双船袜");
    }
}
