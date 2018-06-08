package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shixin-pc on 2018/6/8.
 * 花
 */
public class Flower implements  Plant{
    List<Insect> mInsect=new ArrayList<>();
    @Override
    public void registerInsect(Insect insect) {
        mInsect.add(insect);
    }

    @Override
    public void unregisterInsect(Insect insect) {
        mInsect.remove(insect);
    }

    @Override
    public void notifyInsect(boolean isOpen) {
           if(isOpen){
               for(Insect insect:mInsect){insect.work();}
           }else{
               for(Insect insect:mInsect){insect.unWork();}
           }
    }
}
