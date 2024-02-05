package org.example.builder;

import org.example.builder.CarBuilder;
import org.example.model.Car;

public class Director {
    public Director(){

    }

    public Car buildSportCar(CarBuilder builder){
        CarBuilder toReturn = (CarBuilder) builder.reset().setEngine("High power").setSeats(2);
        return toReturn.build();
    }
    public Car buildUtilityCar(CarBuilder builder){
        CarBuilder toReturn = (CarBuilder) builder.reset().setEngine("Standard").setSeats(4).setTripComputer("Standard").setGps(true);
        return toReturn.build();
    }
}
