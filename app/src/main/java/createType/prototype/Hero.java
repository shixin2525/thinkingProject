package createType.prototype;

import android.util.Log;

/**
 * Created by LSX on 2018/5/8.
 * 英雄原型（克隆）
 */
public class Hero implements Cloneable {
    private Skill mSkill;//引用类型数据,英雄技能
    private int tag;//非引用类型数据,具体值

    public Hero(String heroName) {
        mSkill = new Skill("沉默", "防御", "旋转", "大招");
        tag = 10;
        Log.e("英雄名字:", heroName);
    }

    @Override
    public Object clone() {
        Hero hero = null;
        try {
            hero = (Hero) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return hero;
    }

    public Skill getmSkill() {
        return mSkill;
    }

    public int getTag() {
        return tag;
    }

    public void setmSkill(Skill mSkill) {
        this.mSkill = mSkill;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }
}
