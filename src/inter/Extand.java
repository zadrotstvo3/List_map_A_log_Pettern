package inter;

public interface Extand extends Animal {
    public void rorr();
    public default void lalka(){
        System.out.println("defoult lalka");
    }
}
