package strucType.proxy;

/**
 * Created by shixin-pc on 2018/4/24.
 */

public class Proxy implements Give {
    ByAgent mByAgent;

    public Proxy() {
        mByAgent = new ByAgent();
    }

    @Override
    public void flower() {
        mByAgent.flower();
    }
}
