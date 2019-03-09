package sample.data;

public class Product implements IUserData {
    private String name;
    private int code;
    private float price;

    public Product(String name, int code, float price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public int compareTo(IUserData o) {
        return name.compareTo(((Product)o).getName());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name: " + name  +
                ", code: " + code +
                ", price:" + price +
                '}';
    }
}
