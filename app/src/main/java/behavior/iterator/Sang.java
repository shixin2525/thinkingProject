package behavior.iterator;

/**
 * Created by shixin-pc on 2018/6/9.
 * 歌单
 */

public class Sang {
    private String name;

    public Sang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sang{" +
                "name='" + name + '\'' +
                '}';
    }
}
