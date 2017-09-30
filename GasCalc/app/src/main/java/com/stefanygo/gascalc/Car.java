package com.stefanygo.gascalc;

/**
 * Created by stefanygo on 9/30/17.
 */

public class Car {
    private String model;
    private String make;
    private String year;

    public Car(String model, String make, String year) {
        this.model = model;
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public String getYear() {
        return year;
    }


}
