package assignment9;

abstract class Vehicle{
    abstract public void engine();

}
class Car extends Vehicle{

    @Override
    public void engine() {
        System.out.println("car has good engine");
    }
}
class Truck extends Vehicle{

    @Override
    public void engine() {
        System.out.println("truck has bad engine");
    }
}
public class Question1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.engine();
        Truck truck = new Truck();
        truck.engine();

    }
}

/*
car has good engine
truck has bad engine

Process finished with exit code 0

 */