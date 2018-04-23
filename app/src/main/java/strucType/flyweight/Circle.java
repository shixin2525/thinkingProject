package strucType.flyweight;

import android.util.Log;

/**
 * Created by LSX on 2018/4/23.
 */

public class Circle extends  Shape {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
     Log.e("tag","画了一个" + color +"的圆形");
    }
}
