package behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shixin-pc on 2018/6/9.
 * 对象结构
 */

public class GameRoom {
 private List<Machine> list=new ArrayList<>();
 public void add(Machine machine){
     list.add(machine);
 }
 public void action(Player player){
     for(Machine machine:list){
         machine.accept(player);
     }
 }
}
