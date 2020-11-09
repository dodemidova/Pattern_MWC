package com.company.model;

public class Furniture extends Product implements Costed{
    private int furnitureCost = 350;

    @Override
    public int getCost() {
        return super.getCost() + furnitureCost;
    }

    public int getFurnitureCost() {
        return furnitureCost;
    }

    public void setFurnitureCost(int furnitureCost) {
        this.furnitureCost = furnitureCost;
    }
}
