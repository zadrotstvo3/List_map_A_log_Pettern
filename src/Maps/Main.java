package Maps;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
//        Map<String, User> map = new TreeMap<>();
//        User Dmutruk = new User(1, "Vitalya");
//        map.put("Vitalid", Dmutruk);
//        map.put("Sunak", new User(2, "Vlad"));
//        map.put("Urmanova", new User(3, "Ira"));
//        System.out.println(map);
//        System.out.println(map.get("Sunak"));
//        Set<Entry<String, User>> entries = map.entrySet();
//        Iterator<Entry<String, User>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Entry<String, User> next = iterator.next();
//            User igor = next.setValue(new User(4, "Igor"));
//            System.out.println(next + " " + next.getKey() + " " + next.getValue() + igor);
//        }
//        Set<String> set = map.keySet();
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if (next.contains("Sunak")){
//                iterator.remove();
//            }
//        }
//        System.out.println(set);
        Map<String, List<User>> teams = new HashMap<>();

        List<User> igroki = new ArrayList<>();
        igroki.add(new User(1,"Srna"));
        igroki.add(new User(2,"Taison"));
        igroki.add(new User(3,"Bernard"));

        teams.put("Shakhtar", igroki);

        List<User> igroki2 = new ArrayList<>();
        igroki2.add(new User(11,"Shevchenko"));
        igroki2.add(new User(22,"Rebrov"));
        igroki2.add(new User(33,"Yak"));

        teams.put("dinamo", igroki2);

//        System.out.println(teams.keySet());
//        System.out.println(teams.values());
//        System.out.println(teams);

        Set<Entry<String, List<User>>> entries = teams.entrySet();
        Iterator<Entry<String, List<User>>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<String, List<User>> next = iterator.next();
            List<User> users = next.getValue();
            Iterator<User> iterator1 = users.iterator();
            while (iterator1.hasNext()) {
                User next1 = iterator1.next();
                if (next1.getName() == ("Rebrov")){
                    iterator1.remove();
                }
            }
        }
        System.out.println(igroki2);
    }
}
