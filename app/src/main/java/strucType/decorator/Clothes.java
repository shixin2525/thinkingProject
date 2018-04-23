package strucType.decorator;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/22.
 * 衣服
 */

public class Clothes extends  AbstractClothes{
    public Clothes(AbstractPerson abstractPerson) {
        super(abstractPerson);
    }

    @Override
    public void show() {
        super.show();
        abstractPerson.show();
        say();
    }

    public void say(){
        Log.e("tag","穿了一件衣服");
    }
}
