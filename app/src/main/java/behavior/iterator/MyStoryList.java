package behavior.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体容器
 */
public class MyStoryList implements  SangList{
     private List<Sang> mSang=new ArrayList<>();

    public MyStoryList(List<Sang> mSang) {
        this.mSang = mSang;
    }

    @Override
    public Iterator getIterator() {
        return new SangListIterator();
    }
    /*
    * 具体迭代器类
    * **/
    private class SangListIterator implements  Iterator{
       private int cursor;
        @Override
        public Sang first() {
            cursor=0;
            return mSang.get(cursor);
        }

        @Override
        public Sang next() {
            cursor++;
            if(hashNext()){
              return mSang.get(cursor);
            }
            return null;
        }

        @Override
        public boolean hashNext() {
            return cursor!=mSang.size();
        }

        @Override
        public Sang currentItem() {
            return mSang.get(cursor);
        }
    }
}
