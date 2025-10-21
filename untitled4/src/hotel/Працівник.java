package hotel;

public class Працівник extends Особа {
    protected String посада;
    protected double salary;

    public Працівник(int id, String name, String phone, String посада, double salary) {
        super(id, name, phone);
        this.посада = посада;
        this.salary = salary;
    }

    @Override
    public void дія() {
        System.out.println("Працівник " + name + " виконує свої обов’язки.");
    }

    public void працювати() {
        System.out.println(name + " зараз працює (" + посада + ")");
    }

    @Override
    public String toString() {
        return "Працівник{" + "id=" + id + ", ім’я='" + name + "', посада='" + посада + "', зарплата=" + salary + "}";
    }
}
