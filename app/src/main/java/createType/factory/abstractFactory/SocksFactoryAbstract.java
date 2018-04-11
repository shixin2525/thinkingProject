package createType.factory.abstractFactory;

/**
 * Created by shixin-pc on 2018/4/10.
 * 袜子工厂
 */

public class SocksFactoryAbstract implements SocksStandardAbstract {
    @Override
    public SocksProductAbstract makeSocks() {
        return new SocksProductAbstract();
    }
}
