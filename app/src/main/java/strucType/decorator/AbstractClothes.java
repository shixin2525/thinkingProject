package strucType.decorator;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/22.
 */

public abstract class  AbstractClothes implements  AbstractPerson{
   protected AbstractPerson abstractPerson ;

    public AbstractClothes( AbstractPerson abstractPerson ){
        this.abstractPerson = abstractPerson ;
    }

    @Override
    public void show() {
        abstractPerson.show();
    }

}

