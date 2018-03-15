package inter;

import java.io.IOException;
//mnogo nasledovanii
public class cat implements Animal,Appendable,AutoCloseable{
    @Override
    public Appendable append(CharSequence csq) throws IOException {
        return null;
    }

    @Override
    public Appendable append(CharSequence csq, int start, int end) throws IOException {
        return null;
    }

    @Override
    public Appendable append(char c) throws IOException {
        return null;
    }

    @Override
    public void close() throws Exception {

    }

    @Override
    public void pojrat() {
        System.out.println("very hurd pojrat");
    }

    @Override
    public void speak() {
        System.out.println("mmeeeeouuuu");

    }
}
