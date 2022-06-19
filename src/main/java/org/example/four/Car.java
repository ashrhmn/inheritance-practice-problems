package org.example.four;


public class Car extends Vehicle{
    private int ownershipCost;
    private int warranty;
    private int seatCapacity;
    private CarFuelType carFuelType;
    public Car(int mileage, int price, int ownershipCost, int warranty, int seatCapacity, CarFuelType carFuelType) {
        super(mileage, price);
        this.ownershipCost = ownershipCost;
        this.warranty = warranty;
        this.seatCapacity = seatCapacity;
        this.carFuelType = carFuelType;
    }

    public int getOwnershipCost() {
        return ownershipCost;
    }

    public void setOwnershipCost(int ownershipCost) {
        this.ownershipCost = ownershipCost;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public CarFuelType getCarFuelType() {
        return carFuelType;
    }

    public void setCarFuelType(CarFuelType carFuelType) {
        this.carFuelType = carFuelType;
    }
}
