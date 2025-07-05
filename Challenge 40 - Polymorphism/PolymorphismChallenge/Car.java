package PolymorphismChallenge;

public class Car {

    // four required variable interfaces
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    // default values for all cars
    public Car() {
        this.wheels = 4;
        this.engine = true;
    }

    // five other additional methods as required in question
    public String startEngine() {
        return getClass().getSimpleName() + ": Car engine is starting...";
    }
    public String accelerate() {
        return getClass().getSimpleName() + ": The car is accelerating...";
    }
    public String brake() {
        return getClass().getSimpleName() + ": The car is braking...";
    }

    // two getter methods should also be defined!
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
