//Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории) и включить в список продуктов в вендинг машину.
//Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
package products;


public class Product {
    protected String name;  // Наименование
    protected String brand; // Бренд
    protected double price; // Цена

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double inputPrice) {
        checkPrice (inputPrice);
    }

    public Product() {
        this("product", 100);
    }

    public Product(String inputName, double inputPrice) {
        this("product", "noname", 100);
    }

    public Product(String brand, String name, double price) {
        checkBrand(brand);
        checkName(name);
        checkPrice(price);
    }

    public String displayInfo() {
        return String.format("%s - %s - %f", brand, name, price);
    }

    private void checkPrice (double price) {
        if (price <= 0) this.price = 100;
        else this.price = price;
    }

    private void checkName (String name) {
        if (name == null || name.length() < 4) {
            this.name = "noname";
        } else this.name = name;
    }

    private void checkBrand (String brand) {
        if (brand == null || brand.length() < 4) {
            this.brand = "noname";
        } else this.brand = brand;
    }

}