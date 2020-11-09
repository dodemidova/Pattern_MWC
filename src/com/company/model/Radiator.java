package com.company.model;

public class Radiator extends Product implements Costed {
    private int craneCost = 150;

    @Override
    public int getCost() {
        return super.getCost() + craneCost;
    }

    public int getCraneCost() {
        return craneCost;
    }

    public void setCraneCost(int craneCost) {
        this.craneCost = craneCost;
    }
}
