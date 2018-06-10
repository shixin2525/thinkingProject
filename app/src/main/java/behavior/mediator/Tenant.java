package behavior.mediator;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 房客
 */

public class Tenant extends  People{
    public Tenant(String name, Mediator mMediator) {
        super(name, mMediator);
    }

    public void contact(String msg) {
        mMediator.contact(this, msg);
    }

    public void getMessage(String msg) {
        Log.e("tag", "房客" + name + "," + msg);
    }
}
