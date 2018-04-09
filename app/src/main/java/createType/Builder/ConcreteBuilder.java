package createType.Builder;

import android.os.Build;

/**
 * Created by LSX on 2018/4/9.
 * 具体的建造工具类
 */

public class ConcreteBuilder implements Builder {
    Product mProduct = new Product();

    //如何构建价格
    @Override
    public void setPrice(double price) {
        mProduct.setPrice(price);
    }

    //如何构建名字
    @Override
    public void setName(String name) {
        mProduct.setName(name);
    }

    //返回产品实例
    @Override
    public Product build() {
        return mProduct;
    }
}
