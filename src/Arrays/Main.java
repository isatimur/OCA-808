package Arrays;

public class Main {

    public final static long Long_ID = 1;

    public static void main(String[] args) {
        //array reference variable
//        String [] bugs = { "cricket", "beetle", "ladybug" };
//        String [] alias = bugs;
//        System.out.println(bugs.equals(alias)); // true
//        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
//
        //array reference variable so different objs
        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = {"cricket", "beetle", "ladybug"};
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0


        System.out.println("==================");


    }
}
