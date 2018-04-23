package strucType.adapter.defaultAdapter;

import android.util.Log;
import android.widget.BaseAdapter;

/**
 * Created by LSX on 2018/4/18.
 */

public class DefaultAdapter extends DefaultBaseAdapter {
    private DefaultEnglish mEnglish;

    public DefaultAdapter(DefaultEnglish mEnglish) {
        this.mEnglish = mEnglish;
    }

    @Override
    public void speakMandarin(String msg) {
        Log.e("tag:", msg);
        mEnglish.speak(msg);
    }
}
