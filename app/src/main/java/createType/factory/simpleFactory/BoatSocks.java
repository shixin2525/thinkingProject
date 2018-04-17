package createType.factory.simpleFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/10.
 * 船袜工厂
 */
public class BoatSocks implements  Socks{
    @Override
    public void make() {
        Log.e("tag","生产100双船袜");
    }
}
