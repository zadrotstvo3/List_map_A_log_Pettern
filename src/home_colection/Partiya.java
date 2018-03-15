package home_colection;

import java.util.ArrayList;
import java.util.Comparator;

public class Partiya {
    public static void main(String[] args) {
        ArrayList<Deputat> partiya = new ArrayList<>();
        Deputat Lyashko = new Deputat("Lyashko", 50, "pidor");
        Deputat Kluchko = new Deputat("Kluchko", 51, "tupoi");
        Deputat Yaceniuk = new Deputat("Yaceniuk", 52, "kradiy");
        Deputat Yanykovich = new Deputat("Yanykovich", 53, "baton");
        Deputat Porox = new Deputat("Porox", 54, "Magnat");

        partiya.add(Lyashko);
        partiya.add(Kluchko);
        partiya.add(Kluchko);
        partiya.add(Yaceniuk);
        partiya.add(Yaceniuk);
        partiya.add(Yanykovich);
        partiya.add(Porox);

        ComperatorDep comperatorDep = new ComperatorDep();
        partiya.sort(comperatorDep);
        System.out.println(partiya);
    }
}
