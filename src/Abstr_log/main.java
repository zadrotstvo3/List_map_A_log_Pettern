package Abstr_log;

public class main {
    public static void main(String[] args) {
        circle circle = new circle();
        Rectangle rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
        circle.helo();
        rectangle.helo();
        System.out.println(circle.a);
        circle.a = 102;
        System.out.println(circle.a);
        System.out.println(rectangle.b);
        rectangle.b = 302;
        System.out.println(rectangle.b);
    }
}
