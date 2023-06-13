package bank;

public class AccountIdetifier {
    private int id;
    private String prefix;

    public AccountIdetifier(int id, String prefix) {
        this.id = id;
        this.prefix = prefix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public String toString() {
        return "AccountIdetifier{" +
                "id=" + id +
                ", prefix='" + prefix + '\'' +
                '}';
    }
}
