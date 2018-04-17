package cn.nutown.thinkingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Random;

import algorithm.Sort;
import createType.factory.abstractFactory.ShoesFactoryAbstract;
import createType.factory.abstractFactory.ShoesProductAbstract;
import createType.factory.abstractFactory.ShoesStandardAbstract;
import createType.factory.abstractFactory.SocksFactoryAbstract;
import createType.factory.abstractFactory.SocksProductAbstract;
import createType.factory.abstractFactory.SocksStandardAbstract;
import createType.factory.methodFactory.FactoryStype;
import createType.factory.methodFactory.DomesticFactory;
import createType.factory.simpleFactory.Me;
import createType.builder.ConcreteBuilder;
import createType.builder.Director;
import createType.builder.Product;
import createType.factory.simpleFactory.Socks;
import createType.prototype.Money;
import createType.prototype.PrototypeSimple;

public class MainActivity extends AppCompatActivity {
    int[] arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arr = new int[800];
        for (int i = 0; i < 800; i++) {
            int rand = (int) (Math.random() * 1000 + 1);
            arr[i] = rand;
        }
        //Sort.bubble(arr);
        //Sort.choice(arr);
        //Sort.insert(arr);
    }

    /**
     * 建造者
     */
    private void builderSimple() {
        Director director = new Director(new ConcreteBuilder());
        Product product = director.createBuilder("雪铁龙", 384560.0);
        product.showMsg();
    }

    /**
     * 原型模式
     */
    private void prototype() {
        PrototypeSimple mPrototypeSimple = new PrototypeSimple();
        PrototypeSimple clone = (PrototypeSimple) mPrototypeSimple.clone();
        Log.e("prototype1", (mPrototypeSimple == clone) + "");//内存地址不一样
        Log.e("prototype2", (mPrototypeSimple.equals(clone)) + "");//不一样
        Log.e("prototype3", (mPrototypeSimple.getClass() == clone.getClass()) + "");//类型一致
        //值完全一样
        Log.e("prototype4", "mPrototypeSimple:" + mPrototypeSimple.getId() + "," + mPrototypeSimple.getMoney().toString() + "clone:" + clone.getId() + "," + clone.getMoney().toString());
        //引用类型的内存地址一样
        Log.e("prototype5", (mPrototypeSimple.getMoney() == clone.getMoney()) + "");

        //验证内存地址是否一样的
        Money money = mPrototypeSimple.getMoney();
        mPrototypeSimple.setMoney(money);
        Log.e("prototype6", "mPrototypeSimple:" + mPrototypeSimple.getId() + "," + mPrototypeSimple.getMoney().toString() + "clone:" + clone.getId() + "," + clone.getMoney().toString());
    }

    /**
     * 简单工厂
     */
    private void simpleFactory() {
        Socks boatSocks = Me.makeSocks(0);//丝袜
        Socks silkStockings = Me.makeSocks(1);//船袜
        boatSocks.make();
        silkStockings.make();
    }

    /**
     * 方法工厂
     */
    private void methodFactory() {
        FactoryStype mBoatSocksFactory = new DomesticFactory();//丝袜
        mBoatSocksFactory.makeSocks();
    }

    /**
     * 抽象工厂
     */
    private void abstractFactory() {

        ShoesStandardAbstract shoesFactoryAbstract = new ShoesFactoryAbstract();
        ShoesProductAbstract shoesProductAbstract = shoesFactoryAbstract.makeSocks();

        SocksStandardAbstract socksFactoryAbstract = new SocksFactoryAbstract();
        SocksProductAbstract socksProductAbstract = socksFactoryAbstract.makeSocks();

    }
}

























