package Strings;

/**
 * Created by Тимакс on 21.11.2015.
 */
public class Main {
    public static void main(String[] args) {

//        int t = 1;
//        String a = t+5;//compilation error

        String d = "";
        d += 2;
        d += 'c';
        d += false;
        System.out.println(d);
        if (d == "2cfalse") System.out.println("==");
        if (d.equals("2cfalse")) System.out.println("equals");


    }
}
