package hotel;

public class Клієнт extends Особа {
    private String email;
    private String паспорт;

    public Клієнт(int id, String name, String phone, String email, String паспорт) {
        super(id, name, phone);
        this.email = email;
        this.паспорт = паспорт;
    }

    @Override
    public void дія() {
        System.out.println("Клієнт " + name + " бронює номер.");
    }

    @Override
    public void інфо() {
        System.out.println("Клієнт: " + name + " | email: " + email);
    }
}
