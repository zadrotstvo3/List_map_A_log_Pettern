package home_colection;

import java.util.Comparator;
import java.util.Objects;

public class Deputat{
    public String name;
    public int age;
    public String id;

    public Deputat() {
    }

    public Deputat(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deputat)) return false;
        Deputat deputat = (Deputat) o;
        return age == deputat.age &&
                Objects.equals(name, deputat.name) &&
                Objects.equals(id, deputat.id);
    }


    @Override
    public int hashCode() {

        return Objects.hash(name, age, id);
    }

}
