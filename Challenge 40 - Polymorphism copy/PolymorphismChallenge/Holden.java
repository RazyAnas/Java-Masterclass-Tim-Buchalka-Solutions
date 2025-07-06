package PolymorphismChallenge;

public class Holden extends Car{
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking...";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating...";
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " is starting...";
    }
}
