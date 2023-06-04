package animal;

abstract class Animal {
    private String name;

     public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void voice();
//    {
//        System.out.println("Животное подало голос");
//    }

    public void jump() {
        System.out.println("Животное подпрыгнуло");
    }
}
