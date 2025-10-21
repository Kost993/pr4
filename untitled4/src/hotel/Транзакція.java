package hotel;

public abstract class Транзакція {
    protected int id;
    protected double amount;
    protected String date;

    public Транзакція(int id, double amount, String date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    public abstract void виконати();

    public void інфо() {
        System.out.println("Транзакція ID: " + id + ", сума: " + amount);
    }
}
