package createType.factory.abstractFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/10.
 * 船袜产品
 */
public class BoatSocks implements Socks {
    @Override
    public void make() {
        Log.e("tag","生产100双船袜");
    }
}
