package hotel;

public class Менеджер extends Працівник {

    public Менеджер(int id, String name, String phone, double salary) {
        super(id, name, phone, "Менеджер", salary);
    }

    @Override
    public void дія() {
        System.out.println("Менеджер " + name + " планує роботу персоналу.");
    }
}
