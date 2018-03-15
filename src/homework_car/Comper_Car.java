package homework_car;

import java.util.Comparator;

public class Comper_Car implements Comparator<Avtivka> {
    @Override
    public int compare(Avtivka o1, Avtivka o2) {
        return o1.id - o2.id;
    }
}
