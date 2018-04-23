package strucType.bridge;

/**
 * Created by shixin-pc on 2018/4/23.
 */

public class Computer {
    public Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }
    public void sale(){
        brand.sale();
    }
}
