package behavior.mediator;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体同事类
 */

public class Landlord extends People {

    public Landlord(String name, Mediator mMediator) {
        super(name, mMediator);
    }

    public void contact(String msg) {
        mMediator.contact(this, msg);
    }

    public void getMessage(String msg) {
        Log.e("tag", "房东" + name + "," + msg);
    }
}
