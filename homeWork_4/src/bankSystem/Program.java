package bankSystem;

public class Program {
    public static void main(String[] args) {
        DebetAccount<Emtity> emtityDebetAccount1 = new DebetAccount<>(new Emtity("OOO1", "1E"), 50);
        CreditAccount<Person> personCreditAccount = new CreditAccount<>(new Person("Маша","2P"), 30);
        Transaction<Account<?>> transaction1 = new Transaction<>(emtityDebetAccount1, personCreditAccount, 20);
        transaction1.execute();
        transaction1.execute();
        transaction1.execute();
    }
}
