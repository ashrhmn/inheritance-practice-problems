package org.example.four;

public class Vehicle {
    private int mileage;
    private int price;

    public Vehicle(int mileage, int price) {
        this.mileage = mileage;
        this.price = price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
