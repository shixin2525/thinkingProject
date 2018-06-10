package cn.nutown.thinkingproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import behavior.chain.Brother;
import behavior.chain.Parent;
import behavior.command.Command;
import behavior.command.Invoker;
import behavior.command.PauseCommand;
import behavior.command.PlayCommand;
import behavior.command.SetListCommand;
import behavior.command.Story;
import behavior.command.StoryPlayer;
import behavior.interpreter.NonterminalExpression;
import behavior.interpreter.TerminalExpression;
import behavior.iterator.Iterator;
import behavior.iterator.MyStoryList;
import behavior.iterator.Sang;
import behavior.mediator.HouseMediator;
import behavior.mediator.Landlord;
import behavior.mediator.Tenant;
import behavior.observer.AndroidDev;
import behavior.observer.Bee;
import behavior.observer.CoderPig;
import behavior.observer.Flower;
import behavior.observer.Insect;
import behavior.observer.Plant;
import behavior.state.AfternoonState;
import behavior.state.Context;
import behavior.state.MorningState;
import behavior.strategy.Caculator;
import behavior.template.AbstractClass;
import behavior.template.ConcreteClassA;
import behavior.template.ConcreteClassB;
import behavior.visitor.Dancing;
import behavior.visitor.FemalePlayer;
import behavior.visitor.GameRoom;
import behavior.visitor.Machine;
import behavior.visitor.MalePlayer;
import behavior.visitor.Player;
import behavior.visitor.Shooting;
import createType.builder.ConcreteBuilder;
import createType.builder.DirectorBuilder;
import createType.factory.AccessFactory;
import createType.factory.DataAccess;
import createType.factory.Department;
import createType.factory.IDepartment;
import createType.factory.IFactory;
import createType.factory.IUser;
import createType.factory.SqlServerFactory;
import createType.factory.User;
import createType.factory.simpleFactory.Me;
import createType.prototype.Hero;
import createType.singleton.SingletonThread;

import strucType.Composite.Company;
import strucType.Composite.ConcreteCompany;
import strucType.Composite.HRDepartment;
import strucType.Composite.StaffDepartment;
import strucType.adapter.Adapter;
import strucType.adapter.English;
import strucType.adapter.classAdapter.ClassAdapter;
import strucType.adapter.defaultAdapter.DefaultAdapter;
import strucType.adapter.defaultAdapter.DefaultEnglish;
import strucType.bridge.Brand;
import strucType.bridge.Computer;
import strucType.bridge.Laptop;
import strucType.bridge.Lenovo;
import strucType.decorator.AbstractPerson;
import strucType.decorator.Clothes;
import strucType.decorator.DecoratorMe;
import strucType.decorator.Hats;
import strucType.facade.Faced;
import strucType.flyweight.FlyweightFactory;
import strucType.flyweight.Shape;
import strucType.proxy.Give;
import strucType.proxy.Proxy;


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
//Sort.insert(arr);
        prototype();
    }

    /*
    * 单利模式
    * **/
    private void singleton(String name) {
        SingletonThread.getInstance().checkHero(name);
    }

    /**
     * 建造者
     */
    private void builderSimple() {
        DirectorBuilder director = new DirectorBuilder(new ConcreteBuilder());
        director.createBuilder();
    }

    /**
     * 原型模式
     */
    private void prototype() {
        Hero hero = new Hero("盖伦");
        Hero cloneHero = (Hero) hero.clone();
        //判断类型，内存地址，equals 依次为 true,false,false
        Log.e("prototype1", (hero.getClass() == cloneHero.getClass()) + "," + (hero == cloneHero) + "," + (hero.equals(cloneHero)));
        //打印两个类中的值
        Log.e("prototype2", "hero:" + hero.getmSkill().toString() + ",tag:" + hero.getTag() + ",clone:" + cloneHero.getmSkill().toString() + ",tag:" + cloneHero.getTag());
        //更改原型类中的值
        hero.getmSkill().setR("大招CD中...");
        hero.setTag(20);
        //再打印两个类中的值
        Log.e("prototype3", "hero:" + hero.getmSkill().toString() + ",tag:" + hero.getTag() + ",clone:" + cloneHero.getmSkill().toString() + ",tag:" + cloneHero.getTag());
    }

    /**
     * 简单工厂
     */
    private void simpleFactory(int option) {
        Me.makeSocks(option);
    }

    /**
     * 方法工厂
     */
    private void methodFactory() {
        //基本的数据访问程序
        User user = new User(1, "盖伦");
//        SqlserverUser su=new SqlserverUser();
//        su.insert(user);
//        su.getUser();
        //方法工厂
        IFactory ifactory = new SqlServerFactory();
        IUser iuser = ifactory.createUser();
        iuser.insert(user);
        iuser.getUser();
    }

    /**
     * 抽象工厂
     */
    private void abstractFactory() {
        User user = new User(2, "布隆");
        Department department = new Department(3, "妖姬");

        IFactory acessfactory = new AccessFactory();

        IUser iuser = acessfactory.createUser();
        iuser.insert(user);
        iuser.getUser();


        IDepartment idepartment = acessfactory.createDepartment();
        idepartment.insert(department);
        idepartment.getUser();

        IUser simpleIuser = DataAccess.createUser("SqlserverUser");
        simpleIuser.insert(user);
        simpleIuser.getUser();


        IDepartment sqlserverDepartment = DataAccess.createDepartment("SqlserverDepartment");
        sqlserverDepartment.insert(department);
        sqlserverDepartment.getUser();
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

    /**
     * 桥接模式
     */
    private void bridge() {
        Brand b = new Lenovo();
        Computer c = new Laptop(b);
        c.sale();

    }

    /*
    * 代理模式
    * **/
    private void proxy() {
        Give give = new Proxy();
        give.flower();
    }

    /*
    * 策略模式
    * **/
    private void strategy() {
        Caculator.strategyCompute("+", 3, 2);
    }

    /*
    * 观察者模式
    * **/
    private void observer() {
        //创建被更观察者
        Plant plant = new Flower();
        //创建观察者
        Insect bee1 = new Bee();
        Insect bee2 = new Bee();
        plant.registerInsect(bee1);
        plant.registerInsect(bee2);
        plant.notifyInsect(true);

       /*
       * java的支持的观察者方式
       * **/
        CoderPig cp = new CoderPig();
        AndroidDev ad = new AndroidDev();
        cp.update("更新了!");
        cp.deleteObserver(ad);
    }

    /*
    * 迭代器
    * **/
    private void iterator() {
        List<Sang> list = new ArrayList<>();
        list.add(new Sang("难忘今宵"));
        list.add(new Sang("女人花"));
        list.add(new Sang("忘情水"));
        list.add(new Sang("王婆卖豆腐"));

        MyStoryList msl = new MyStoryList(list);
        Iterator iterator = msl.getIterator();

        while (iterator.hashNext()) {
            Log.e("tag", iterator.currentItem().toString());
            iterator.next();
        }
    }

    /*
    * 命令模式
    * **/
    private void command() {
        //创建列表
        List<Story> mList = new ArrayList<>();
        mList.add(new Story("难忘今宵", "www.nanwangjinxiao.com"));
        mList.add(new Story("覆水难收", "www.fushuinanshou.com"));
        mList.add(new Story("传说", "www.chuanshuo.com"));

        //实例化命令执行类
        StoryPlayer mStoryPlayer = new StoryPlayer();

        //实例化命令对象
        SetListCommand setListC = new SetListCommand(mStoryPlayer);
        Command palyC = new PlayCommand(mStoryPlayer);
        Command pauseC = new PauseCommand(mStoryPlayer);

        //实例化请求者
        Invoker invoker = new Invoker();
        invoker.setSetList(setListC);
        invoker.setPlayList(mList);
        invoker.setPlayC(palyC);
        invoker.setPauseC(pauseC);
    }

    /*
    * 备忘录模式
    * **/
    private void memento() {
        behavior.memento.Character character = new behavior.memento.Character(2000, 1000, 0);
        character.setHp(500);
        character.setMp(200);
        character.setMoney(3000);
        character.save();
    }

    /*
    * 中介者模式
    * **/
    private void mediator() {
        //实例化中介者
        HouseMediator houseMediator = new HouseMediator();
        //实例化同事对象，传入中介者
        Landlord landlord = new Landlord("包租婆", houseMediator);
        Tenant tenant = new Tenant("小青年", houseMediator);
        //为中介者传入同事对象
        houseMediator.setmLandlord(landlord);
        houseMediator.setmTenant(tenant);
        //调用
        landlord.contact("单间500");
    }

    /*
    * 解释器模式
    * **/
    private void interpreter() {
        behavior.interpreter.Context context =new behavior.interpreter.Context("呵呵","哈哈");
        TerminalExpression te=new TerminalExpression();
        NonterminalExpression ne=new NonterminalExpression();
        te.Interpret(context);
        ne.Interpret(context);
    }

    /*
    * 访问者模式
    * **/
    private void visitor() {
        GameRoom gr = new GameRoom();
        gr.add(new Shooting());
        gr.add(new Dancing());

        Player mp = new MalePlayer();
        Player fp = new FemalePlayer();

        gr.action(mp);
        gr.action(fp);
    }

    /*
    * 责任链模式
    * **/
    private void chain() {
        Brother brother = new Brother();
        Parent parent = new Parent();

        brother.setNextHandler(parent);//指定下家

        brother.handlerRequest("要钱", 200);
    }

    /*
    * 状态模式
    * **/
    private void state() {
        MorningState ms = new MorningState();
        AfternoonState as = new AfternoonState();
        Context context = new Context();
        context.setState(ms);
        context.setState(as);
    }

    /*
    * 摸板方法
    * **/
    private void template() {
        AbstractClass acA = new ConcreteClassA();
        acA.templateMethod();
        AbstractClass acB = new ConcreteClassB();
        acB.templateMethod();
    }
}

























