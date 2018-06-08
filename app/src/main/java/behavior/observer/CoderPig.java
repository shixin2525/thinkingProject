package behavior.observer;

import java.util.Observable;

/**
 * Created by shixin-pc on 2018/6/8.
 */

public class CoderPig extends Observable {
   public void update(String msg){
   this.setChanged();//这局话必须有
   this.notifyObservers();
   }
}
