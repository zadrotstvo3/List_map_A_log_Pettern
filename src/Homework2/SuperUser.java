package Homework2;

public class SuperUser extends user {
    private String email;
    private int parol;

    public SuperUser(){
        super();
    }

    public SuperUser(int age, String name, String color, String email, int parol){
        super(age, name, color);
        this.email = email;
        this.parol = parol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getParol() {
        return parol;
    }

    public void setParol(int parol) {
        this.parol = parol;
    }

    @Override
    public String toString() {
        return  this.email + " " + this.parol + super.toString();
    }

    public static void test(){
        System.out.println("test child");
    }
}
