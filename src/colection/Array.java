package colection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Array {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
//        ArrayList<Person> people2 = new ArrayList<>();
//        numbers.add(0,5);
//        numbers.add(1,4);
//        numbers.add(2,2);
//        numbers.add(3,1);
//        numbers.add(4,9);
        Person Rick = new Person("ARick", 80, "white");
        Person Morty = new Person("CMorty", 82, "white");
        Person Vitalik = new Person("DVitalya", 5, "white");
        Person Oksana = new Person("BOksana", 45, "white");

        people.add(Rick);
        people.add(Morty);
        people.add(Vitalik);
        people.add(Rick);
        people.add(Oksana);

//        people2.add(Rick);
//        people2.add(Vitalik);

//        people.addAll(people2);
//        people.removeAll(people2);

//        people.contains(Oksana);

//        people.get(2);

//        System.out.println(people.indexOf(Morty));

//        int i = people.indexOf(Oksana);
//        System.out.println(people.get(i));

//        System.out.println(people.isEmpty());

//        System.out.println(people.lastIndexOf(Rick));

//        people.remove(Rick);// tilki pershogo udalyaet
//        System.out.println(people);

//        people.remove(0);
//        people.remove(2);
//        people.remove(Oksana);
//        System.out.println(people);

//        System.out.println(people.size());

//        people.set(people.size()-1,Vitalik);
//        System.out.println(people);

//        people.set(0,Vitalik);
//        System.out.println(people);

//        List<Person> people1 = people.subList(0, 3);
//        System.out.println(people1);

//        for (Person person : people) {
//            if (person.age>20){
//                person.age = -1;
//                System.out.println(person);
//            }
//            System.out.println(person);
//        }

//        for (int i = 0; i < people.size(); i++) {
//            Person person = people.get(i);
//            System.out.println(person);
//        }

//        TreeSet<Person> PersonSet = new TreeSet<>();
//        PersonSet.add(Rick);
//        PersonSet.add(Morty);
//        PersonSet.add(Vitalik);
//        PersonSet.add(Rick);
//        PersonSet.add(Oksana);
//        System.out.println(PersonSet);
//        PersonComperotor personComperotor = new PersonComperotor();
//        people.sort(personComperotor);
        System.out.println(people);
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()){
            Person personid = iterator.next();
            if(personid.age == 5){
                iterator.remove();
            }
        }
        System.out.println(people);
    }
}
