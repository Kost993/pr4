package hotel;

public class Рахунок extends Транзакція {
    private int кількістьПослуг;

    public Рахунок(int id, double amount, String date, int кількістьПослуг) {
        super(id, amount, date);
        this.кількістьПослуг = кількістьПослуг;
    }

    @Override
    public void виконати() {
        System.out.println("Рахунок сформовано на суму " + amount + " грн за " + кількістьПослуг + " послуг.");
    }
}
