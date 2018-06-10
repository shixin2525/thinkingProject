package behavior.interpreter;

import android.util.Log;

import behavior.state.Context;

/**
 * Created by shixin-pc on 2018/6/10.
 * 终结符表达式
 */

public class TerminalExpression extends AbstractExpression {
    @Override
    public void Interpret(behavior.interpreter.Context context) {
        Log.e("tag","终端解释器");
    }
}
