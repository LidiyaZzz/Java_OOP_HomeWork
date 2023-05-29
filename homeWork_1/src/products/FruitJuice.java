package products;

public class FruitJuice extends Product {
    private String fruit;
    private double volume;

    public FruitJuice(String brand, String name, double price, String fruit, double volume) {
        super(brand, name, price);
        this.fruit = fruit;
        this.volume = volume;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String displayInfo() {
        return String.format("бренд: %s, название: %s, цена: %f, фруктовый сок: %s, объем: %s",
                brand, name, price, fruit, volume);
    }
}
