package org.fasttrackit;

/**
 * Hello world!
 *fdsafdas
 * fdsa
 * fdsa
 * fdsa
 * fdsa
 */

// this is a comment
public class App 
{
    public static void main( String[] args )
    {
        Car car = new Car();
        car.name = "Dacia";
        car.color = "white";
        car.doorCount = 4;
        car.mileage = 7.5;
        car.running = true;

        Engine engine = new Engine();
        engine.manufacturer = "Renault";
        engine.capacity = 1500;

        car.engine = engine;

        car.engine.manufacturer = "BMW";
        engine.manufacturer = "Microsoft";

        engine = null;




        Car car2 = new Car();
        car2.name = "sfa";

        // some new content
    }
}
