package hotel;

public class Покоївка extends Працівник {

    public Покоївка(int id, String name, String phone, double salary) {
        super(id, name, phone, "Покоївка", salary);
    }

    @Override
    public void дія() {
        System.out.println("Покоївка " + name + " прибирає номер.");
    }
}
