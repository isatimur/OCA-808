package increments;

/**
 * Created by Тимакс on 28.11.2015.
 */
public class Test {
    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        //int d = (a < b) ? (a < c) ? a : (b < c) ? b : c; compilation fails
        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c:a;
        System.out.println(c);
    }
}
