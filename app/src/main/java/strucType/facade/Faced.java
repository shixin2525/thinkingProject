package strucType.facade;

import android.util.Log;

/**
 * Created by LSX on 2018/4/23.
 *
 */

public class Faced {
    Hamburger  mHamburger;
    Cola mCola;
    Fries mFries;

    public Faced() {
        this.mHamburger = new Hamburger();
        this.mCola = new Cola();
        this.mFries = new Fries();
    }

    public void combinationA(){
        Log.e("tag",mHamburger.show()+"加"+mCola.show());
    }
    public void combinationB(){
        Log.e("tag",mHamburger.show()+"加"+mFries.show());
    }
}
