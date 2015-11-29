package Inheritance;

import java.util.ArrayList;

/**
 * Created by Тимакс on 29.11.2015.
 */
public class TestArrayListOfAnimals {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Tiger());
        animals.add(new Cat());
        ArrayList<Hunter> animals2 = new ArrayList<>();
        animals2.add(new Tiger());
        animals2.add(new Cat());
        ArrayList<Tiger> animals3 = new ArrayList<>();
        //animals3.add(new Cat());//his child cannot accept parent instance
    }
}
