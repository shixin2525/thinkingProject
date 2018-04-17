package createType.factory.simpleFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/10.
 * 丝袜工厂
 */
public class SilkStockings implements Socks {

    public  void make() {
        Log.e("tag", "生产100双丝袜");
    }
}
