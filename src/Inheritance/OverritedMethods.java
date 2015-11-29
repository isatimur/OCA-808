package Inheritance;

/**
 * Created by Тимакс on 28.11.2015.
 */
class Base {
    public void test(){
        System.out.println("Base ");
    }
}
class DerivedA extends Base {
    public void test(){
        System.out.println("DerivedA ");
    }
}
public class OverritedMethods extends DerivedA{
    public void test() {
        System.out.println("DerivedB");
    }

    public static void main(String[] args) {
        Base t1 = new OverritedMethods();
        Base t2 = new DerivedA();
        Base t3 = new OverritedMethods();
        t1 = (Base) t3;
        Base t4 = (DerivedA)t3;
        t1.test();
        t4.test();

    }
}
