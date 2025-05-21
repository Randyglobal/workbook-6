package com.pluralsight.assets;

import com.pluralsight.finterface.Valuable;

public abstract class FixedAssets implements Valuable {
    private String name;
    private double marketValue;

    public FixedAssets(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
