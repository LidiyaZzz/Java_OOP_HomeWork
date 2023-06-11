package animal;

import org.w3c.dom.ls.LSOutput;

public class program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        System.out.println(cat1.getId());
        Cat cat2 = new Cat("Мурзик");
        System.out.println(cat2.getId());
        Cat cat3 = new Cat("Васька");
        System.out.println(cat3.getId());
        cat1.swim(10);
        cat2.run(20);
        cat3.swim(30);

        Dog dog1 = new Dog("Бобик");
        System.out.println(dog1.getId());
        Dog dog2 = new Dog("Барбос");
        System.out.println(dog2.getId());
        Dog dog3 = new Dog("Дружок");
        System.out.println(dog3.getId());
        dog1.swim(100);
        dog2.run(200);
        dog3.swim(300);

        System.out.printf("животных всего %d", Animal.getCounter());
        System.out.printf("котов всего %d", Cat.getCatCounter());
    }
}
