package behavior.memento;

/**
 * Created by shixin-pc on 2018/6/9.
 * 数据bean类
 */

public class Memento {
 private int hp;
 private int mp;
 private int money;

    public Memento(int hp, int mp, int money) {
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

}
