package com.codecool.vehicles;

public class Vehicle {
    /**
     *  The name of vehicle
     */
    private final String name;

    /**
     * Speed with normal without any additional conditional conditions on track and weather.
     */
    private int normalSpeed;

    private int distanceTraveled;

    protected Vehicle() {
        this.name = generateName();
    }

    protected abstract String generateName();
    
    public abstract void prepareForLap();

    public void moveForAnHour(){
        distanceTraveled += actualSpeed;
    }

    @Override
    public String toString() {

    }
}
