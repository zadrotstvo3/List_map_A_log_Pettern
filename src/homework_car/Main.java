package homework_car;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Avtivka> Car = new ArrayList<>();

        Power power = new Power(655);
        Avtivka Porshe = new Avtivka(3, "Porshe", power, "German", 21);
        Avtivka Moskvich = new Avtivka(1, "Moskva", power, "Moskov", 11);
        Avtivka Bmw = new Avtivka(4, "BMW", power, "German", 55);
        Avtivka Jiguli = new Avtivka(2, "Xarkov", power, "Russia", 14);

        Car.add(Porshe);
        Car.add(Bmw);
        Car.add(Jiguli);
        Car.add(Moskvich);

        Comper_Car comper_car = new Comper_Car();
        Car.sort(comper_car);

        for (int i = 0; i < Car.size(); i++) {
            Avtivka j = Car.get(i);
            if (j.id != 1){
                j.id = 55;
            }
        }
        System.out.println(Car);
    }
}
