package products;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public FruitJuice getJuice(double volume) {
        for (Product product: products) {
            if (product instanceof FruitJuice) {
                if (((FruitJuice)product).getVolume() == volume) {
                    return (FruitJuice)product;
                }
            }
        }
        return null;
    }

    public Coffee getCoffee(String type) {
        for (Product product: products) {
            if (product instanceof Coffee) {
                if (((Coffee)product).getType().equals(type)) {
                    return (Coffee)product;
                }
            }
        }
        return null;
    }


}
