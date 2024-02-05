package org.example;

import org.example.builder.CarBuilder;
import org.example.builder.Director;
import org.example.model.Car;

public class Main {
    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        Car utilityCar = director.buildUtilityCar(builder);
        Car powered = director.buildSportCar(builder);
        System.out.println(powered.getEngine());
    }
}