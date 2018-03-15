package Homework2;

import java.util.Scanner;

public class user {
    private int age;
    private String name;
    private String color;

    public user(){

    }

    public user(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void setAge(int vik) {
//        if (age != 50) System.out.println("Error");
        this.age = vik;
    }

    public int getAge() {
        String passs = "1234";
        System.out.println("Enter password");
        String nextLine = new Scanner(System.in).nextLine();
        if (passs.equals(nextLine)) {
            return this.age;
        } else {
            return 0;
        }
    }

    public void setName(String imeno) {
        this.name = imeno;
    }

    public String getName() {
        return this.name;
    }

    public void setColor(String cvet){
        this.color = cvet;
    }

    public String getColor(){
        return this.color;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age + " " + this.color;
    }
    public static void test(){
        System.out.println("tes user");
    }
}