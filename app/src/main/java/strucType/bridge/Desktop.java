package strucType.bridge;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/23.
 */

public class Desktop extends Computer {
    public Desktop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        Log.e("tag", "台式机电脑");
    }
}
