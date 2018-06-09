package behavior.iterator;

/**
 * Created by shixin-pc on 2018/6/9.
 * 抽象迭代器
 */

public interface Iterator {
 Sang first();
 Sang next();
 boolean hashNext();
 Sang currentItem();
}
