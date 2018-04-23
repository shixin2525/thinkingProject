package strucType.decorator;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/22.
 * 帽子
 */

public class Hats extends AbstractClothes {
    public Hats(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public void show() {
        super.show();
        say();
    }

    public void say() {
        Log.e("tag", "戴上了一顶帽子");
    }
}
