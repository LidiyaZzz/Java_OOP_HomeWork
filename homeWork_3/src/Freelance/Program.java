package Freelance;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();
    static Worker generateEmployer() {
        String[] names = new String[] {"Юрий", "Егор", "Алексей", "Камиль", "Владимир", "Данил", "Леонид", "Артём", "Елизар", "Олег"};
        String[] surnames = new String[] {"Тимофеев", "Никольский", "Мухин", "Золотарев", "Котов", "Романов", "Петров", "Павлов", "Дмитриев", "Демидова"};
        int salary = random.nextInt(20000, 80000);
        return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
    }

    public static void main(String[] args) {
        Employer[] employers = new Employer[10];
        for (int i = 0; i < employers.length; i++) {
            employers[i] = generateEmployer();
        }

        Arrays.sort(employers);
//       , new SalaryComparator()

        for (Employer employer: employers) {
            System.out.println(employer);
        }
    }
}
