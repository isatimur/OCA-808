package Exceptions;

/**
 * Created by Тимакс on 29.11.2015.
 */
public class App {
    String myStr = "7007";
    public void doStuff(String str){
        int myNum=0;
        try {
            String myStr = str;
            myNum = Integer.parseInt(myStr);
        } catch (NumberFormatException e){
            System.out.println("ERROR");
        }
        System.out.println("mstr "+myStr +" myNum "+myNum);
    }

    public static void main(String[] args) {
        App app = new App();
        app.doStuff("9009");
    }
}
