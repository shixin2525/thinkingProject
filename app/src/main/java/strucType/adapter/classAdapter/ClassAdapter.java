package strucType.adapter.classAdapter;

import android.util.Log;

/**
 * Created by LSX on 2018/4/18.
 */

public class ClassAdapter extends ClassEnglish implements ClassChinese {

    @Override
    public void speakChinese(String msg) {
         speakEnglish(msg);
    }
}
