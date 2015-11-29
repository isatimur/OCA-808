package Exceptions;

/**
 * Created by Тимакс on 29.11.2015.
 */
public class TestMyException {
    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e) {
            System.out.println("A");
        }
    }

    private static void method1() {
        try {
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
        } catch (RuntimeException ex) {
            System.out.println("B");
        }
    }
}
