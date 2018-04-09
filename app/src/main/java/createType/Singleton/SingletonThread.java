package createType.Singleton;

/**
 * Created by LSX on 2018/4/9.
 * 静态内部类单利
 * note:最优写法
 */

public class SingletonThread {

    private SingletonThread() {
    }

    public static final SingletonThread getInstance() {
        return MySingletonHolder.mMySingleton;
    }

    private static class MySingletonHolder {
        private static SingletonThread mMySingleton = new SingletonThread();
    }
}
