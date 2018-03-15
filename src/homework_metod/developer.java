package homework_metod;

public class developer {
    public String name;
    public String hobby;

    public developer() {
    }

    public developer(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "developer{" +
                "name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}

