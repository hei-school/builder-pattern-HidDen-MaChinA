package org.example.builder;

import org.example.model.Car;

public class CarBuilder  implements Builder {
    private Integer seats;
    private String engine;
    private String stripComputer;
    private boolean GPS;

    public CarBuilder(){

    }

    @Override
    public Builder reset() {
        this.engine = null;
        this.GPS = false;
        this.seats = null;
        this.stripComputer = null;
        return this;
    }

    @Override
    public Builder setSeats(Integer number) {
        this.seats = number;
        return this;
    }

    @Override
    public Builder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    @Override
    public Builder setTripComputer(String stripComputer) {
        this.stripComputer = stripComputer;
        return this;
    }

    @Override
    public Builder setGps(boolean Gps) {
        this.GPS = Gps;
        return this;
    }

    public Car build(){
        return new Car(this.seats, this.engine, this.stripComputer,this.GPS);
    }
}
