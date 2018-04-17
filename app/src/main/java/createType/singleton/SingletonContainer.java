package createType.singleton;

import java.util.HashMap;

/**
 * Created by LSX on 2018/4/9.
 * 单利的容器
 * note:将单利注入一个统一的管理类
 */

public class SingletonContainer {
    private static HashMap<String, Object> mHashMap = new HashMap<>();

    private SingletonContainer() {
    }

    public static void register(String key, Object instance) {
        if (!mHashMap.containsKey(key)) {
            mHashMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        if (mHashMap != null && key != null) {
            mHashMap.get(key);
        }
        return null;
    }
}
