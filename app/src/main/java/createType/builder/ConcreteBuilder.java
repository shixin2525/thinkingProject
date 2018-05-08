package createType.builder;

/**
 * Created by LSX on 2018/5/8.
 */

public class ConcreteBuilder implements  GameMapBuilder {
    private MapBuilder mMapBuilder=new MapBuilder();
    @Override
    public void sapperStyle() {
        mMapBuilder.setSapperStyle("中国风的小兵");
    }

    @Override
    public void mapColor() {
        mMapBuilder.setMapColor("红色地图");
    }
}
