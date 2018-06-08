package behavior.strategy;

/**
 * Created by shixin-pc on 2018/6/8.
 */

public class Add implements  Compute {
    @Override
    public float computer(int first, int secomd) {
        return first+secomd;
    }
}
