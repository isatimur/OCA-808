package Overloading;

/**
 * Created by Тимакс on 24.11.2015.
 */

import Arrays.Main;

class TestClass {
    public static void main(String[] args) {
        Integer a = 4;
        new TestClass().probe(a); //5
        int b = 4;
        new TestClass().probe(b); //6
        int[] d = new int[]{1, 3, 6};
        new TestClass().probe(d); //6
        System.out.println(Main.Long_ID);
    }

    void probe(int... x) {
        System.out.println("In ...");
    } //1

    void probe(Integer x) {
        System.out.println("In Integer");
    } //2

    void probe(long x) {
        System.out.println("In long");
    } //3

    void probe(Long x) {
        System.out.println("In LONG");
    } //4
}