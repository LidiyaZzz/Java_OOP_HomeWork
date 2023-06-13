package bankSystem;

public class Emtity implements PersonalData{
    private final String name;
    private final String inn;

    public Emtity(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getInn() {
        return inn;
    }

    @Override
    public String toString() {
        return String.format("%s; %s", inn, name);
    }
}
