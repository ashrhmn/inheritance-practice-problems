package org.example.four;

public class TVS extends Bike{
    private String makeType;

    public TVS(int mileage, int price, int numberOfCylinders, int numberOfGears, BikeCoolingType bikeCoolingType, BikeWheelType bikeWheelType, int fuelTankSize, String makeType) {
        super(mileage, price, numberOfCylinders, numberOfGears, bikeCoolingType, bikeWheelType, fuelTankSize);
        this.makeType = makeType;
    }

    public String getMakeType() {
        return makeType;
    }

    public void setMakeType(String makeType) {
        this.makeType = makeType;
    }
}
