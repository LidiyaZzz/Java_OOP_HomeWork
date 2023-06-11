package animal;

import java.util.Random;

public abstract class Animal {
    protected String name;
    protected int maxSwim;
    protected int maxRun;
    private int id;
    private static Random random = new Random();
    public static int indenifier = 1000;
    public static int counter = 1000;

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println("stutic initiolizer");
        if (random.nextInt(2) == 0){
        indenifier = 1000;
        } else {
            indenifier = 2000;
        }
    }

    {
        System.out.println("intiolizer");
        id = ++indenifier;
        counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void setMaxSwim(int maxSwim) {
        this.maxSwim = maxSwim;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    public Animal(String name, int maxSwim, int maxRun) {
        System.out.println("Construtor");

        this.name = name;
        this.maxSwim = maxSwim;
        this.maxRun = maxRun;
    }

    void run (int distanse) {
        if (distanse <= maxRun) {
            System.out.printf("%s пробежал %d \n", name, distanse);
        } else {
            System.out.printf("%s не смог пробежать %d, только %d \n", name, distanse, maxRun);
        }
    }

    void swim (int distanse) {
        if (distanse <= maxSwim) {
            System.out.printf("%s проплыл %d \n", name, distanse);
        } else {
            System.out.printf("%s не смог проплыть %d, только %d \n", name, distanse, maxSwim);
        }
    }
}
