package entrypoint;

/**
 * Created by Тимакс on 29.11.2015.
 */
public class MainTest {
    public static void main(String[] args) {
        System.out.println("String main "+args[0]);
    }
    public static void main(Object[] args) {
        System.out.println("ob main "+args[0]);
    }
    public static void main(int[] args) {
        System.out.println("int main "+args[0]);
    }
}
