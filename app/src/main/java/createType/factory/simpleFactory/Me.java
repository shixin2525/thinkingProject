package createType.factory.simpleFactory;

/**
 * Created by shixin-pc on 2018/4/10.
 * 工厂
 */
public class Me {
    private static BoatSocks mBoatSocks = new BoatSocks();
    private static SilkStockings mSilkStockings = new SilkStockings();

    /**
     * @param style 0=丝袜 1=船袜
     */
    public static Socks makeSocks(int style) {
        switch (style) {
            case 0:
                mBoatSocks.make();
                return mBoatSocks;
            case 1:
                mSilkStockings.make();
                return mSilkStockings;
        }
        return null;
    }
}
