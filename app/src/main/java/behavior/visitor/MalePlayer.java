package behavior.visitor;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体访问者
 */

public class MalePlayer implements Player {
    @Override
    public void visit(Shooting shooting) {
        Log.e("tag","男玩家玩"+shooting.feature());

    }

    @Override
    public void visit(Dancing dancing) {
        Log.e("tag","男玩家玩"+dancing.feature());
    }
}
