class Vehicle {
    void drive() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class VehicleCarOverride {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        vehicle.drive();
        car.drive();
    }
}
