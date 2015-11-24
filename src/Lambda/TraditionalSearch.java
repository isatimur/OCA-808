package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Тимакс on 24.11.2015.
 */
public class TraditionalSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        System.out.println("the first sample");
        //working with a lambda predicate states - deferred execution. No need to create new implementations.
        print(animals, a -> a.isCanHop());
        print(animals, a -> !a.isCanSwim()); // so you can pass a negate operator
        print(animals, b -> b.isCanSwim());

        //an interesting method that accepts Predicate<T> class to remove by condition
        System.out.println("======================================");
        animals.removeIf(animal -> animal.toString().contains("fish"));
        System.out.println("======================================");


        System.out.println("the second one");
        //the exact same example of Lambda but with a different look
        print(animals, (Animal a) -> {
            return a.isCanHop();
        });
        print(animals, (Animal a) -> {
            return !a.isCanSwim();
        }); // so you can pass a negate operator
        print(animals, (Animal a) -> {
            return a.isCanSwim();
        });


        //working with direct implementation of CheckTrait interface.
//        print(animals, new CheckIfHopper());
//        print(animals, new CheckIfSwimming());

        System.out.println("End!");

    }

    private static void print(List<Animal> animals, Predicate<Animal> animalPredicate) {
        for (Animal animal : animals) {
            if (animalPredicate.test(animal)) {
                System.out.println(animal + " ");
            }
        }
        System.out.println();
    }

    //has to be commented out to say compiler that Lambda working with previous example of code.
//    private static void print(List<Animal> animals, CheckTrait checkTrait) {
//        System.out.println("Interface implementation");
//        for (Animal animal : animals) {
//            if (checkTrait.test(animal)) {
//                System.out.println(animal + " ");
//            }
//        }
//        System.out.println();
//    }


}
