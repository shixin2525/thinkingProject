package createType.Builder;

import android.util.Log;

/**
 * Created by LSX on 2018/4/9.
 * 产品类
 */
public class Product {
    private double price;
    private String name;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void showMsg() {
        Log.e("tag", "你选择的车型是:" + name + "价格:" + price);
    }
}
