package Exceptions;

import java.util.ArrayList;

/**
 * Created by Тимакс on 28.11.2015.
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String[] myArray;
        try {
            while (true){
                list.add("dsdsd");
            }
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        } catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println("fine");
    }
}
