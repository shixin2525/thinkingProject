package behavior.interpreter;

import behavior.state.Context;

/**
 * Created by shixin-pc on 2018/6/10.
 * 抽象表达式
 */

public abstract class AbstractExpression {
   public abstract  void Interpret(behavior.interpreter.Context context);
}
