package createType.factory.methodFactory;

/**
 * Created by shixin-pc on 2018/4/10.
 * 国产袜子工厂
 */

public class DomesticFactory implements  FactoryStype {
    @Override
    public SocksProduct makeSocks() {
        return new SocksProduct();
    }
}
