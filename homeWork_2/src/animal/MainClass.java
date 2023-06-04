/*
Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

package animal;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        Cat cat = new Cat("Barsik", 5);
//        Plate plate = new Plate(100);
//        plate.info();
//        cat.eat();
//        plate.setFood(plate.getFood() - cat.getAppetite());

        Cat cat1 = new Cat("Персик", "Рыжий");
//        cat1.jump();
//        cat1.voice();
        Dog dog1 = new Dog("Шарик", 8);
//        dog1.jump();
//        dog1.voice();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);
        processAnimals(animals);
    }

    public static void processAnimals(List<Animal> animals) {
        for (Animal animal:animals) {
            animal.voice();
            if (animal instanceof Cat) System.out.println(((Cat)animal).getColor());
        }
    }


}