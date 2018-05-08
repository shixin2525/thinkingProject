package createType.singleton;

/**
 * Created by LSX on 2018/4/9.
 * 饿汉式
 * note:由于类加载机制原因，可能造成内存浪费(最简单)
 */

public class SingletonOne {
    private static SingletonOne mMySingleton = new SingletonOne();

    private SingletonOne() {
    }

    public static SingletonOne getInstance() {
        return mMySingleton;
    }

    public String checkHero(String name){
        return  "检测英雄ID是否符合规范";
    }
}

