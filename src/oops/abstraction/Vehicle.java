package oops.abstraction;

abstract class Vehicle {
    public int a =10;
    abstract void start();
}
abstract class Plane{
    abstract void start();
}
//  class Scooter extends Vehicle,Plane{
    class Scooter extends Plane{
    void start() {
        System.out.println("Scooter starts with kick");
    }

    public static void main(String[] args) {
//      Vehicle v = new Vehicle();

        Scooter s = new Scooter();
        s.start();
    }

}
