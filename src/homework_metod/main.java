package homework_metod;

public class main {
    public static void main(String[] args) {
        events events1 = new events("first","mashine","lviv", 51);
        events events2 = new events("two","airobika","rivne", 22);
        events events3 = new events("third","fly","kyiv", 12);
        developer developer1 = new developer("vitalik","fly");
        developer developer2 = new developer("vitya","mashine");
        developer developer3 = new developer("igor","airobika");
        events[] Event = {events1, events2, events3};
        developer[] Develop = {developer1, developer2, developer3};
        for (int i = 0; i < Develop.length; i++) {
            developer devel = Develop[i];
            for (int j = 0; j < Event.length; j++) {
                events eventl = Event[j];
                if (devel.hobby == eventl.tecnologi){
                    System.out.println(devel + " " + eventl);
                }
            }
        }
    }
}
