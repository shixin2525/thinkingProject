package createType.factory.abstractFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/10.
 * 袜子产品
 */
public class SocksProductAbstract implements SocksAbstract {
    @Override
    public void make() {
        Log.e("tag","生产100双船袜");
    }
}
