package behavior.mediator;

/**
 * Created by shixin-pc on 2018/6/9.
 * 抽象同事类
 */

public abstract class People {
    protected String name;
    protected Mediator mMediator;//每个人都知道中介

    public People(String name, Mediator mMediator) {
        this.name = name;
        this.mMediator = mMediator;
    }
}
