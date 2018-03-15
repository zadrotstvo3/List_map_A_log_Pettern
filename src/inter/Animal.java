package inter;

public interface Animal {
    int a = 44;

    public void speak();

    public default void pojrat() {
        System.out.println("xavatu syka");
    }
}
