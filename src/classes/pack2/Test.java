package classes.pack2;

/**
 * Created by Тимакс on 06.12.2015.
 */
class Test{
    public static void main(String[] args){
        String hello = "Hello", lo = "lo";
        System.out.print((classes.pack2.Other.hello == hello) + " "); //line 1
        System.out.print((classes.pack1.Other.hello == hello) + " "); //line 2
        System.out.print((hello == ("Hel"+"lo")) + " "); //line 3
        System.out.print((hello == ("Hel"+lo)) + " "); //line 4
        System.out.println(hello == ("Hel"+lo).intern()); //line 5
    }
}
class Other { static String hello = "Hello"; }
