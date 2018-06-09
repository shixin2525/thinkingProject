package behavior.visitor;

/**
 * Created by shixin-pc on 2018/6/9.
 * 抽象访问者
 */

public interface Player {
    void visit(Shooting shooting);
    void visit(Dancing dancing);
}
