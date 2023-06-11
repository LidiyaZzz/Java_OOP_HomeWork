package Freelance;

public class Freelancer extends Employer {
    double hour;
    public Freelancer(String name, String surname, double salary, double hour) {
        super(name, surname, salary);
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        return salary / 240 * hour;
    }


}
