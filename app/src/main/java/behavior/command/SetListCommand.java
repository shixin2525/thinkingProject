package behavior.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shixin-pc on 2018/6/9.
 * 设置播放列表的具体类
 */

public class SetListCommand implements Command {
    private StoryPlayer mStoryPlayer;
    private List<Story> mStory = new ArrayList<>();

    public SetListCommand(StoryPlayer mStoryPlayer) {
        this.mStoryPlayer = mStoryPlayer;
    }
    @Override
    public void execute() {
        mStoryPlayer.setStoryPlayer(mStory);
    }

    public void setmStory(List<Story> mStory) {
        this.mStory = mStory;
    }
}
