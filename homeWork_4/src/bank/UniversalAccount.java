package bank;

public class UniversalAccount {
    private final Object id;
    private double amount;

    public UniversalAccount(Object id, double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Object getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("Сумма средств на счете #%s : %.2f руб.", id, amount);
    }
}
