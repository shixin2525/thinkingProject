package behavior.visitor;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体的元素
 */

public class Shooting implements  Machine {
    @Override
    public void accept(Player player) {
        player.visit(this);
    }
    public String feature(){
        return  "投篮机";
    }
}
