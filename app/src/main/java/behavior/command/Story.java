package behavior.command;

/**
 * Created by shixin-pc on 2018/6/9.
 * 歌单
 */

public class Story {
private String name;
private String url;

    public Story(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Story{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
