package Strings;

/**
 * Created by Тимакс on 28.11.2015.
 */
public class Greeting {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Duke");
        String str1 = sb1.toString();
        String str2 = str1;
        if(str1==str2){
            System.out.println("TRUE!");
        }
    }
}
