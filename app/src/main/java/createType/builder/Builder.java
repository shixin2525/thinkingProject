package createType.builder;

/**
 * Created by LSX on 2018/4/9.
 * 规范产品组建
 */

public interface Builder {
    void setPrice(double price);

    void setName(String name);

    Product build();
}
