package animal;

public class Cat extends Animal{

    private static int catCounter;
    {
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    public Cat(String name) {
        super(name, 0, 200);
    }

    @Override
    void swim(int distanse) {
        System.out.println("Коты не плавают");
    }
}
