package homework_car;

public class Avtivka {
    public int id;
    public String name;
    public Power power;
    public String develop;
    public Diametr diametr;

    public Avtivka() {
    }

    public Avtivka(int id, String name, Power power, String develop, int diametr) {
        this.id = id;
        this.name = name;
        this.power = power;
        this.develop = develop;
        this.diametr = new Diametr(diametr);
    }

    @Override
    public String toString() {
        return "Avtivka{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", power=" + power +
                ", develop='" + develop + '\'' +
                ", diametr=" + diametr +
                '}';
    }
}
