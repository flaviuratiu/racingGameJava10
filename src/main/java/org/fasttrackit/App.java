package org.fasttrackit;

/**
 * Hello world!
 * fdsafdas
 * fdsa
 * fdsa
 * fdsa
 * fdsa
 */

// this is a comment
public class App {
    public static void main(String[] args) {
//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//        engine.capacity = 1500;
//        engine.expiryDate =
//                LocalDateTime.now().plusYears(10);
//
//        Car car = new Car(engine);
//        car.setName("    Dacia     ");
//        car.setColor("White");
//        car.doorCount = 4;
//        car.setMileage(7.5);
//        car.running = true;
//
//        System.out.println(car.getName());
//
//        double carTraveledDistance
//                = car.accelerate(100, 2);
//
//
//
//
//        System.out.println("Hello");
//        System.out.println(car.toString());
//
//
//
//
//        car.engine = engine;
//
//        car.engine.manufacturer = "BMW";
//        engine.manufacturer = "Microsoft";
//
//        engine = null;
//
//
//        Car car2 = new Car(new Engine());
//        car2.setName("sfa");

        // Example of static variables unique for the whole application
        Vehicle vehicle1 = new Vehicle();
//        vehicle1.vehicleCount++;

        Vehicle vehicle2 = new Vehicle();
//        vehicle2.vehicleCount = 2;

//        Vehicle.vehicleCount = 3;

        System.out.println("Value from vehicle 1: " + vehicle1.vehicleCount);
        System.out.println("Value from vehicle 2: " + vehicle2.vehicleCount);
        System.out.println("Value from Vehicle class: " + Vehicle.vehicleCount);

    }
}
