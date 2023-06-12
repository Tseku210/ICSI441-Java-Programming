package org.example;

public class Bus extends Car {
    private int numPassengers;
    private double fare;
    private final int COST = 100;

    public Bus(double x, double y, double dir, int numPassengers) {
        super(x, y, dir);
        this.numPassengers = numPassengers;
        this.fare = 0.0;
    }

    public void boardBus(int numPassengers) {
        this.numPassengers += numPassengers;
    }

    public void leaveBus(int numPassengers) {
        this.numPassengers -= numPassengers;
        if (this.numPassengers < 0) {
            this.numPassengers = 0;
        }
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public void move(double len) {
        super.move(len);
        fare += numPassengers * len * COST;
    }
}
