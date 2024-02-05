package org.example.model;

public class Car {
    Integer seats;
    String engine;
    String stripComputer;
    boolean GPS;

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getStripComputer() {
        return stripComputer;
    }

    public void setStripComputer(String stripComputer) {
        this.stripComputer = stripComputer;
    }

    public boolean haveGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    public Car(Integer seats, String engine, String stripComputer, boolean GPS){
        this.engine = engine;
        this.GPS = GPS;
        this.seats = seats;
        this.stripComputer = stripComputer;
    }
}
