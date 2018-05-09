package createType.factory.simpleFactory;

/**
 * Created by shixin-pc on 2018/4/10.
 * 工厂
 */
public class Me {
    private static FirstPlay mFirstPlay = new FirstPlay();
    private static SuperiorPlayer mSuperiorPlayer = new SuperiorPlayer();

    /**
     * @param option  0=第一次玩 1=大神
     */
    public static Level makeSocks(int option) {
        switch (option) {
            case 0:
                mFirstPlay.userLevel();
                return mFirstPlay;
            case 1:
                mSuperiorPlayer.userLevel();
                return mSuperiorPlayer;
        }
        return null;
    }
}
