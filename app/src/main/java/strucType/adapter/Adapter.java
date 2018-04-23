package strucType.adapter;

import android.util.Log;

/**
 * Created by LSX on 2018/4/18.
 */

public class Adapter   implements Chinese{
    private English mEnglish;

    public Adapter(English mEnglish) {
        this.mEnglish = mEnglish;
    }

    @Override
    public void speak(String msg) {
        Log.e("tag:", msg);
        mEnglish.speak(msg);
    }
}
