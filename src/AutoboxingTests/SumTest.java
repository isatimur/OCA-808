package AutoboxingTests;

/**
 * Created by Тимакс on 29.11.2015.
 */
public class SumTest {
    public static void doSum(int x, int y) {
        System.out.println("int "+(x+y));
    }
    public static void doSum(double x, double y) {
        System.out.println("double "+(x+y));
    }
    public static void doSum(Integer x, Integer y) {
        System.out.println("Integer "+(x+y));
    }
    public static void doSum(float x, float y) {
        System.out.println("float "+(x+y));
    }


    public static void main(String[] args) {
        doSum(10,20);
        doSum(10.0,20.0);
    }
}
