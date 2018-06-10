package behavior.interpreter;

import android.util.Log;

import behavior.state.Context;

/**
 * Created by shixin-pc on 2018/6/10.
 * 非终结符表达式
 */

public class NonterminalExpression extends  AbstractExpression {
    @Override
    public void Interpret(behavior.interpreter.Context context) {
        Log.e("tag","非终端解释器");
    }
}
