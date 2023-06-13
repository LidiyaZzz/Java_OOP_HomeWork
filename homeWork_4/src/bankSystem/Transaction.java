package bankSystem;

public class Transaction<T extends Account<? extends PersonalData>> {
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){
        if (from.getAmount() > amount) {
            System.out.println("Осуществлен перевод на сумму "+ amount);
            System.out.printf("Счет списания #%s: %f. Счет зачисления  #%s: %f.\n", from.getData(), from.getAmount(), to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.println(from);
            System.out.println(to);

        } else {
            System.out.println("Недостаточно денег на счете");
        }
    }
}
