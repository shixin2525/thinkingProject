package cn.nutown.thinkingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import createType.Builder.Builder;
import createType.Builder.ConcreteBuilder;
import createType.Builder.Director;
import createType.Builder.Product;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        builderSimple();
    }

    /**
     * 建造者
     */
    private void builderSimple() {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.createBuilder("雪铁龙", 384560.0);
        product.showMsg();
    }

}
