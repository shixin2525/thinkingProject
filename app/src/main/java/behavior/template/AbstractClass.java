package behavior.template;

/**
 * Created by shixin-pc on 2018/6/9.
 * 抽象摸板类
 */

public abstract class AbstractClass {
    protected abstract void primitiveOperation1();

    protected abstract void primitiveOperation2();


    /*
    * 摸板方法给出的逻辑骨架，而逻辑的组成是一些相应的抽象操作，延迟到子类中实现
    * **/
    public void templateMethod(){
        primitiveOperation1();
        primitiveOperation2();
    }
}
