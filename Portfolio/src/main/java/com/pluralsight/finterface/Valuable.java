package com.pluralsight.finterface;

public interface Valuable {
    double getValue();
    default String payment(){
        return "All Finances will have payments by default";
    }
}
