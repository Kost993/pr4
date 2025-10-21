package hotel;

public abstract class Особа {
    protected int id;
    protected String name;
    protected String phone;

    public Особа(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public abstract void дія();
    public void інфо() {
        System.out.println("Особа: " + name + " (" + phone + ")");
    }

    @Override
    public String toString() {
        return "Особа{" + "id=" + id + ", ім’я='" + name + "', телефон='" + phone + "'}";
    }
}
