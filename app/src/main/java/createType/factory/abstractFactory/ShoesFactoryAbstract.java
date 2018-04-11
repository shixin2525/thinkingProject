package createType.factory.abstractFactory;

/**
 * Created by shixin-pc on 2018/4/11.
 */

public class ShoesFactoryAbstract implements ShoesStandardAbstract {

    @Override
    public ShoesProductAbstract makeSocks() {
        return new ShoesProductAbstract();
    }
}
