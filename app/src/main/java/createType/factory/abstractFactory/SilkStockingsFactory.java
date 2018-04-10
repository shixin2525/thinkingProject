package createType.factory.abstractFactory;

/**
 * Created by shixin-pc on 2018/4/10.
 * 丝袜工厂
 */

public class SilkStockingsFactory implements FactoryStype {
    @Override
    public BoatSocks makeBoatSocks() {
        return null ;
    }

    @Override
    public SilkStockings makeSilkStockings() {
        return new SilkStockings();
    }
}
