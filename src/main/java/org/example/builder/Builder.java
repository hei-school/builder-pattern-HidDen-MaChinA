package org.example.builder;

public interface Builder {
    Builder reset();
    Builder setSeats(Integer number);
    Builder setEngine(String engine);
    Builder setTripComputer(String tripComputer);
    Builder setGps(boolean Gps);
}
