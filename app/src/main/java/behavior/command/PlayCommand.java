package behavior.command;

/**
 * Created by shixin-pc on 2018/6/9.
 * 具体的播放命令类
 */
public class PlayCommand implements  Command {
    private StoryPlayer mStoryPlayer;

    public PlayCommand(StoryPlayer mStoryPlayer) {
        this.mStoryPlayer = mStoryPlayer;
    }

    @Override
    public void execute() {
        mStoryPlayer.play();
    }
}
