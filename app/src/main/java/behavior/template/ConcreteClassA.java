package behavior.template;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 */

public class ConcreteClassA extends  AbstractClass {
    @Override
    protected void primitiveOperation1() {
        Log.e("tag","具体A实现1");
    }

    @Override
    protected void primitiveOperation2() {
        Log.e("tag","具体A实现2");
    }
}
