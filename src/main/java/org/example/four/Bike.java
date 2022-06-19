package org.example.four;

public class Bike extends Vehicle{
    private int numberOfCylinders;
    private int numberOfGears;
    private BikeCoolingType bikeCoolingType;
    private BikeWheelType bikeWheelType;
    private int fuelTankSize;

    public Bike(int mileage, int price, int numberOfCylinders, int numberOfGears, BikeCoolingType bikeCoolingType, BikeWheelType bikeWheelType, int fuelTankSize) {
        super(mileage, price);
        this.numberOfCylinders = numberOfCylinders;
        this.numberOfGears = numberOfGears;
        this.bikeCoolingType = bikeCoolingType;
        this.bikeWheelType = bikeWheelType;
        this.fuelTankSize = fuelTankSize;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public BikeCoolingType getBikeCoolingType() {
        return bikeCoolingType;
    }

    public void setBikeCoolingType(BikeCoolingType bikeCoolingType) {
        this.bikeCoolingType = bikeCoolingType;
    }

    public BikeWheelType getBikeWheelType() {
        return bikeWheelType;
    }

    public void setBikeWheelType(BikeWheelType bikeWheelType) {
        this.bikeWheelType = bikeWheelType;
    }

    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }
}
