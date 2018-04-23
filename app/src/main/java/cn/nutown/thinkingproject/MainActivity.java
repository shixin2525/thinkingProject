package cn.nutown.thinkingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
import strucType.Composite.Company;
import strucType.Composite.ConcreteCompany;
import strucType.Composite.HRDepartment;
import strucType.Composite.StaffDepartment;
import strucType.adapter.Adapter;
import strucType.adapter.English;
import strucType.adapter.classAdapter.ClassAdapter;
import strucType.adapter.defaultAdapter.DefaultAdapter;
import strucType.adapter.defaultAdapter.DefaultEnglish;
import strucType.decorator.AbstractPerson;
import strucType.decorator.Clothes;
import strucType.decorator.DecoratorMe;
import strucType.decorator.Hats;
import strucType.facade.Faced;
import strucType.flyweight.FlyweightFactory;
import strucType.flyweight.Shape;


public class MainActivity extends AppCompatActivity {
    int[] arr;
    int[] arrB = {51, 54, 56, 85, 75, 31, 21, 02, 12, 54, 10, 13, 16, 18, 95, 8, 47, 56, 333, 87, 546, 312};

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
        // Sort.insert(arrB);
        //Sort.insert(arrB);
        // composite();
        Sort.insert(arr);
        flyweight();
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

    /**
     * 装饰模式
     */
    private void decorator() {
        AbstractPerson me = new DecoratorMe();
        AbstractPerson clothes = new Clothes(me);
        AbstractPerson hats = new Hats(me);
        hats.show();
    }

    /**
     * 组合模式
     */
    private void composite() {
        Company company = new ConcreteCompany("成都纽糖总公司");
        company.add(new HRDepartment("总公司人事部门"));
        company.add(new StaffDepartment("总公司员工部门"));

        Company company1 = new ConcreteCompany("华北纽糖分公司");
        company1.add(new HRDepartment("华北纽糖分公司人事部门"));
        company1.add(new StaffDepartment("华北纽糖分公司员工部门"));
        company.add(company1);

        Company company2 = new ConcreteCompany("华南纽糖科技");
        company2.add(new HRDepartment("华南纽糖科技人事部门"));
        company2.add(new StaffDepartment("华南纽糖科技员工部门"));
        company.add(company2);

        Company company3 = new ConcreteCompany("西北纽糖科技");
        company3.add(new HRDepartment("西北纽糖科技人事部门"));
        company3.add(new StaffDepartment("西北纽糖科技员工部门"));
        company.add(company3);

        company.show();
        company.responsibility();

    }


    /**
     * 适配器模式
     */
    private void adapter() {
        //ObjectAdapter
        Adapter adapter = new Adapter(new English());
        adapter.speak("你好!");
        //ClassAdapter
        ClassAdapter ca = new ClassAdapter();
        ca.speakChinese("你好！");
        //DefaultAdapter
        DefaultAdapter da = new DefaultAdapter(new DefaultEnglish());
        da.speakMandarin("你好！");
    }

    /**
     * 外观模式
     */
    private void facade() {
        Faced faced = new Faced();
        faced.combinationA();
        faced.combinationB();
    }

    /**
     * 享元模式
     */
    private void flyweight() {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        Log.e("tag", "一共绘制了" + FlyweightFactory.getSum() + "种颜色的圆形");

    }

}

























