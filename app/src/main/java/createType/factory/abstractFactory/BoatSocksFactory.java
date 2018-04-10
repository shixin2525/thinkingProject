package createType.factory.abstractFactory;

/**
 * Created by shixin-pc on 2018/4/10.
 * 船袜工厂
 */

public class BoatSocksFactory implements FactoryStype {

    @Override
    public BoatSocks makeBoatSocks() {
        return new BoatSocks();
    }

    @Override
    public SilkStockings makeSilkStockings() {
        return null;
    }
}
