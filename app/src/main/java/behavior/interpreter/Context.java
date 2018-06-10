package behavior.interpreter;

/**
 * Created by shixin-pc on 2018/6/10.
 */

public class Context {
 private String input;
 private String onput;

    public Context(String input, String onput) {
        this.input = input;
        this.onput = onput;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void setOnput(String onput) {
        this.onput = onput;
    }

    public String getInput() {
        return input;
    }

    public String getOnput() {
        return onput;
    }

    @Override
    public String toString() {
        return "Context{" +
                "input='" + input + '\'' +
                ", onput='" + onput + '\'' +
                '}';
    }
}
