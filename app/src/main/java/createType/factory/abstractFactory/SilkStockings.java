package createType.factory.abstractFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/10.
 * 丝袜产品
 */
public class SilkStockings implements Socks {

    public  void make() {
        Log.e("tag", "生产100双丝袜");
    }
}
