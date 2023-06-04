package animal;

class Dog extends Animal {
    private int veight;

    public Dog(String name, int veight) {
        super(name);
        this.veight = veight;
    }

    public int getVeight() {
        return veight;
    }

    public void setVeight(int veight) {
        this.veight = veight;
    }

    @Override
    public void voice() {
        System.out.println("Собака лает");
    }
}
