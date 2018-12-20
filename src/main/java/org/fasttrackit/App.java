package org.fasttrackit;

import java.time.LocalDateTime;

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
        Car car = new Car();
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        double carTraveledDistance
                = car.accelerate(100, 2);

        


        System.out.println("Hello");
        System.out.println(car.toString());

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;
        engine.expiryDate =
                LocalDateTime.now().plusYears(10);


        car.engine = engine;

        car.engine.manufacturer = "BMW";
        engine.manufacturer = "Microsoft";

        engine = null;


        Car car2 = new Car();
        car2.name = "sfa";

        // some new content
    }
}
