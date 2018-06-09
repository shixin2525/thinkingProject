package behavior.memento;

/**
 * Created by shixin-pc on 2018/6/9.
 * 角色类
 */

public class Character {
    private int hp;
    private int mp;
    private int money;

    public Character(int hp, int mp, int money) {
        this.hp = hp;
        this.mp = mp;
        this.money = money;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Character{" +
                "hp=" + hp +
                ", mp=" + mp +
                ", money=" + money +
                '}';
    }

    //创建一个备忘录，保存当前自身状态
    public void save(){
        return; new Memento(hp,mp,money);
    }
    //传入一个备忘录对象，恢复自身状态
    public void restore(Memento memento){
        this.hp=memento.getHp();
        this.mp=memento.getMp();
        this.money=memento.getMoney();
    }
}
