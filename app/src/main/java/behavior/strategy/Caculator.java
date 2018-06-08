package behavior.strategy;

/**
 * Created by shixin-pc on 2018/6/8.
 */

public class Caculator {
    public static float compute(String operator, int first, int second) {
        switch (operator) {
            case "+":
                return first - second;
            case "-":
                return first - second;
            default:
                return 0.0f;
        }
    }

    public static float strategyCompute(String operator, int first, int second) {
        switch (operator) {
            case "+":
                return new Add().computer(first,second);
            case "-":
                return new Sub().computer(first,second);
            default:
                return 0.0f;
        }
    }

}
