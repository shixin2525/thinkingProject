package createType.prototype;

/**
 * Created by shixin-pc on 2018/4/9.
 *
 */

public class Money {
    private String name;
    private double price;

    public Money(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {

        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Money{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
