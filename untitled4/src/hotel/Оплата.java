package hotel;

public class Оплата extends Транзакція {
    private boolean completed;

    public Оплата(int id, double amount, String date) {
        super(id, amount, date);
    }

    @Override
    public void виконати() {
        completed = true;
        System.out.println("Оплату на суму " + amount + " виконано.");
    }
}
