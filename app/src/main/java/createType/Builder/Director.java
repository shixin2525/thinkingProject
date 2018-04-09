package createType.Builder;

/**
 * Created by LSX on 2018/4/9.
 * 统一的建造者
 */

public class Director {
    Builder mBuiler;

    public Director(Builder mBuiler) {
        this.mBuiler = mBuiler;
    }

    public Product createBuilder(String name, double price) {
        mBuiler.setName(name);
        mBuiler.setPrice(price);
        return mBuiler.build();
    }
}
