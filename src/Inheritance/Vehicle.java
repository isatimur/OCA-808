package Inheritance;

/**
 * Created by Тимакс on 29.11.2015.
 */
class Vehicle {
    int x;
    Vehicle(){
        this(10);
    }
    Vehicle(int x){
        this.x=x;
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        System.out.println(vehicle);
    }
}
class Car extends Vehicle {
    int y;
    Car(){
        //super(); compilation fails because this(20) should be the first
        this(20);
    }
    Car(int y){
        this.y=y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }
}
