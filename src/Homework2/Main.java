package Homework2;

public class Main {

    public static void main(String[] args) {
        user homer = new user(40, "homer", "black");
        System.out.println(homer);
        user sergiy = new SuperUser(28, "Serhii", "White", "ukrnet", 85);
        System.out.println(sergiy);
        SuperUser vitalya = new SuperUser(40, "vitalya", "white", "gmail", 15);
        vitalya.setEmail("mail");
        System.out.println(vitalya);
        SuperUser.test();
    }
}
