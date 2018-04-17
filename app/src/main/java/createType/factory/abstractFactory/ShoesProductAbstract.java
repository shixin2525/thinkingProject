package createType.factory.abstractFactory;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/11.
 */

public class ShoesProductAbstract implements  ShoesAbstract{
    @Override
    public void make() {
        Log.e("tag","生产100双鞋子");
    }
}
