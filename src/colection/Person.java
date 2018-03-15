package colection;

import java.util.Objects;

public class Person implements Comparable<Person> {
    public String name;
    public int age;
    public String color;

    public Person() {
    }

    public Person(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(color, person.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, color);
    }

    @Override
    public int compareTo(Person o) {
        if (this.age - o.age == 0) {
            return -1;
        }
        return o.age - this.age;
    }
}
