package strucType.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LSX on 2018/4/23.
 * 享元工厂
 */

public class FlyweightFactory {
    private static Map<String, Shape> shapes = new HashMap<String, Shape>();

    public static Shape getShape(String key){
        Shape shape = shapes.get(key);
        //如果shape==null,表示不存在,则新建,并且保持到共享池中
        if(shape == null){
            shape = new Circle(key);
            shapes.put(key, shape);
        }
        return shape;
    }

    public static int getSum(){
        return shapes.size();
    }
}
