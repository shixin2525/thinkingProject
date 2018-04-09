package createType.prototype;

import android.util.Log;

/**
 * Created by shixin-pc on 2018/4/9.
 * 原型模式（克隆）
 */
public class PrototypeSimple implements Cloneable {
    private Money money;
    private double id;

    public PrototypeSimple() {
        this.money = new Money("雪铁龙", 350000.0);
        this.id = 10;
    }

    @Override
    public Object clone() {
        PrototypeSimple prototypeSimple = null;
        try {
            prototypeSimple = (PrototypeSimple) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prototypeSimple;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Money getMoney() {
        return money;
    }

    public double getId() {
        return id;
    }
}
