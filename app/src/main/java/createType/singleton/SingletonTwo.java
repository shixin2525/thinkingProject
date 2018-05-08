package createType.singleton;

/**
 * Created by LSX on 2018/4/9.
 * 懒汉式
 * note：需要synchronizedg同步关键字保证线程安全
 */

public class SingletonTwo {
    private static SingletonTwo mMySingleton;

    private SingletonTwo() {
    }

    public synchronized static SingletonTwo getInstance() {
        if (mMySingleton == null) {
            mMySingleton = new SingletonTwo();
        }
        return mMySingleton;
    }

    public String checkHero(String name) {
        return "检测英雄ID是否符合规范";
    }
}
