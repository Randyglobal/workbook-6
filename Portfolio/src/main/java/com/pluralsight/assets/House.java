package com.pluralsight.assets;

import com.pluralsight.finterface.Valuable;

public class House implements Valuable {

    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(int yearBuilt, int squareFeet, int bedrooms) {
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return 0;
    }
}
