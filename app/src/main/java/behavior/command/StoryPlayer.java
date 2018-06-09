package behavior.command;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shixin-pc on 2018/6/9.
 * 命令执行者
 */
public class StoryPlayer {
    private int cursor = 0;//当前播放项
    private int pauseCursor=-1;//暂停播放
    private List<Story> mStoryList = new ArrayList<>();//播放列表

    public void setStoryPlayer(List<Story> mStoryList) {
        cursor = 0;
        this.mStoryList = mStoryList;
    }

    public void play(){
        cursor=0;
        if(mStoryList.size()==0){
            Log.e("tag","请先设置播放列表");
        }else{
            if(pauseCursor==cursor){
                Log.e("tag","继续播放第"+cursor+"个");
            }else {
                Log.e("tag","开始播放第"+cursor+"个");
            }
        }
    }

    public void pause(){
        pauseCursor=cursor;
    }
}
