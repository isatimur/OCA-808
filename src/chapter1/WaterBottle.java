package chapter1;

/**
 * Created by Тимакс on 20.11.2015.
 */
public class WaterBottle {
    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        WaterBottle wb = new WaterBottle();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}