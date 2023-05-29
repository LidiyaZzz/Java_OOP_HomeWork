package products;

public class Coffee extends Product {

    private String taste;
    private String type;

    public String getTaste() {
        return taste;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Coffee(String brand, String name, double price, String taste, String type) {
        super(brand, name, price);
        this.taste = taste;
        this.type = type;
    }

    @Override
    public String displayInfo() {
        return String.format("бренд: %s, название: %s, цена: %f, добавка: %s, тип: %s",
                brand, name, price, taste, type);
    }
}
