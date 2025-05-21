package com.pluralsight.assets;

import com.pluralsight.finterface.Valuable;

public class Jewelry implements Valuable {
    private double karat;

    public Jewelry(double karat) {
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
