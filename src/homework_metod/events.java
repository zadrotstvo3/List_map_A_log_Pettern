package homework_metod;

public class events {
    public String id;
    public String tecnologi;
    public String sity;
    public int price;

    public events() {
    }

    public events(String id, String tecnologi, String sity, int price) {
        this.id = id;
        this.tecnologi = tecnologi;
        this.sity = sity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "events{" +
                "id='" + id + '\'' +
                ", tecnologi='" + tecnologi + '\'' +
                ", sity='" + sity + '\'' +
                ", price=" + price +
                '}';
    }
}

