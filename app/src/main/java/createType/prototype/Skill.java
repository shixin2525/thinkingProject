package createType.prototype;

/**
 * Created by LSX on 2018/5/8.
 * 英雄技能
 */

public class Skill {
   private String q;
   private String w;
   private String e;
   private String r;

    public Skill(String q, String w, String e, String r) {
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public void setW(String w) {
        this.w = w;
    }

    public void setE(String e) {
        this.e = e;
    }

    public void setR(String r) {
        this.r = r;
    }

    public String getQ() {
        return q;
    }

    public String getW() {
        return w;
    }

    public String getE() {
        return e;
    }

    public String getR() {
        return r;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "q='" + q + '\'' +
                ", w='" + w + '\'' +
                ", e='" + e + '\'' +
                ", r='" + r + '\'' +
                '}';
    }
}
