package hotel;

public class Адміністратор extends Працівник {
    private String accessLevel;

    public Адміністратор(int id, String name, String phone, double salary, String accessLevel) {
        super(id, name, phone, "Адміністратор", salary);
        this.accessLevel = accessLevel;
    }

    @Override
    public void дія() {
        System.out.println("Адміністратор " + name + " керує бронюваннями.");
    }

    public void керувати() {
        System.out.println(name + " перевіряє статус номерів.");
    }
}
