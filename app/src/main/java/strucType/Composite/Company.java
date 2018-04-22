package strucType.Composite;

/**
 * Created by shixin-pc on 2018/4/21.
 * 公司的抽象类
 */

public abstract class Company {
    private String name;

    public Company(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void add(Company c);

    public abstract void remote(Company c);

    public abstract  void show();//名字

    public abstract void responsibility();//履新的职责

}
