package Exceptions;

/**
 * Created by Тимакс on 28.11.2015.
 */
public class Test {
    void readCard(int a1) throws Exception {
        System.out.println("Checked Exception");
    }

    void changeCard(int as) throws RuntimeException {
        System.out.println("Runtime");
    }

    public static void main(String[] args) {
        Test test = new Test();
        int f = 10020;
// test.readCard(f);
// failed to compile because we are programmatically saying to handle checked exception.
        test.changeCard(f);

    }
}
