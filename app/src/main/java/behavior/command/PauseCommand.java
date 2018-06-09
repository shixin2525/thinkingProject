package behavior.command;

/**
 * Created by shixin-pc on 2018/6/9.
 * 暂停命令类
 */
public class PauseCommand implements  Command {
    private StoryPlayer mStoryPlayer;

    public PauseCommand(StoryPlayer mStoryPlayer) {
        this.mStoryPlayer = mStoryPlayer;
    }

    @Override
    public void execute() {
        mStoryPlayer.pause();
    }
}
