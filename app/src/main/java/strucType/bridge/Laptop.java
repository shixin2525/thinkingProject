package strucType.bridge;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/23.
 */

public class Laptop extends Computer {
    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    public void sale() {
        super.sale();
        Log.e("tag","笔记本电脑");
    }
}
