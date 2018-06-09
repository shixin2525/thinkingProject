package behavior.template;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 */

public class ConcreteClassB extends  AbstractClass {
    @Override
    protected void primitiveOperation1() {
        Log.e("tag","具体B实现1");
    }

    @Override
    protected void primitiveOperation2() {
        Log.e("tag","具体B实现2");
    }
}
