package products;

import products.Product;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
//        product1.brand = "ООО Чистый источник";
//        product1.name = "Бутылка с водой";
//        product1.price = 123.23;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый источник", "Бутылка с водой", -10);
//        product1.brand = "ООО Чистый источник";
//        product1.name = "Бутылка с водой";
//        product1.price = 123.23;
        System.out.println(product2.displayInfo());

        Product coffee1 = new Coffee(
                "Paulig",
                "Crema",
                120,
                "Vanil",
                "latte"
        );
        System.out.println(coffee1.displayInfo());

        Product coffee2 = new Coffee(
                "Jockey",
                "Classic",
                100,
                "Caramel",
                "Capuchino"
        );
        System.out.println(coffee2.displayInfo());

        Product fruitJuice1 = new FruitJuice(
                "Моя семья",
                "Сок",
                110,
                "Яблочный",
                1.2
        );
        System.out.println(fruitJuice1.displayInfo());
        Product fruitJuice2 = new FruitJuice(
                "Rich",
                "Сок",
                150,
                "Манго",
                0.5
        );

        System.out.println(fruitJuice2.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(coffee1);
        products.add(coffee2);
        products.add(fruitJuice1);
        products.add(fruitJuice2);

        VendingMachine vendingMachine = new VendingMachine(products);
        FruitJuice myJuice = vendingMachine.getJuice(0.5);
        if (myJuice != null) {
            System.out.println("Вы купили: " );
            System.out.println(myJuice.displayInfo());
        }
        else {
            System.out.println("Такого продукта нет в автомате" );
        }

        Coffee myCoffee = vendingMachine.getCoffee("Capuchino");
        if (myCoffee != null) {
            System.out.println("Вы купили: " );
            System.out.println(myCoffee.displayInfo());
        }
        else {
            System.out.println("Такого продукта нет в автомате" );
        }


    }
}
