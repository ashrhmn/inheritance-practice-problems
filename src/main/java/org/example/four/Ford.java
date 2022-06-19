package org.example.four;

public class Ford extends Car{
    private String modelType;

    public Ford(int mileage, int price, int ownershipCost, int warranty, int seatCapacity, CarFuelType carFuelType, String modelType) {
        super(mileage, price, ownershipCost, warranty, seatCapacity, carFuelType);
        this.modelType = modelType;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
}
