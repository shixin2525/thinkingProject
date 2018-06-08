package behavior.observer;

/**
 * Created by shixin-pc on 2018/6/8.
 * 抽象被观察者（花）
 */
public interface Plant {
    void registerInsect(Insect insect);
    void unregisterInsect(Insect insect);
    void notifyInsect(boolean isOpen);
}
