package behavior.chain;

/**
 * Created by shixin-pc on 2018/6/9.
 * 抽象处理者类
 */

public abstract class  Handler {
private Handler nextHandler;//下家

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /*
    * 请求
    * **/
    public abstract  void handlerRequest(String str,int money);
}
