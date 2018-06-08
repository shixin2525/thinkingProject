package behavior.observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by shixin-pc on 2018/6/8.
 */

public class AndroidDev  implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        Log.e("tag","JAVA观察者收到消息"+arg.toString());
    }
}
