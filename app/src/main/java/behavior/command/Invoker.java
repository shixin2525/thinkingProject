package behavior.command;

import java.util.List;

/**
 * Created by shixin-pc on 2018/6/9.
 * 请求执行者类
 */
public class Invoker {
 private SetListCommand setList;
 private Command playC;
 private Command pauseC;

    public void setSetList(SetListCommand setList) {
        this.setList = setList;
    }

    public void setPlayC(Command playC) {
        this.playC = playC;
    }

    public void setPauseC(Command pauseC) {
        this.pauseC = pauseC;
    }

    public void setPlayList(List<Story> mStory){
        setList.setmStory(mStory);
        setList.execute();
    }
    public void play(){
        playC.execute();
    }
    public void pause(){
        pauseC.execute();
    }

}
