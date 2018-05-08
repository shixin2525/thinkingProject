package createType.builder;

/**
 * Created by LSX on 2018/5/8.
 */

public class DirectorBuilder {
    GameMapBuilder mGameMapBuilder;

    public DirectorBuilder(GameMapBuilder gameMapBuilder) {
        this.mGameMapBuilder = gameMapBuilder;
    }

    public GameMapBuilder createBuilder() {
        mGameMapBuilder.sapperStyle();
        mGameMapBuilder.mapColor();
        return mGameMapBuilder;
    }
}
