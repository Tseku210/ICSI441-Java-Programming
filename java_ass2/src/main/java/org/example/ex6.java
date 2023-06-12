package org.example;

public class ex6 {
    public static void main(String[] args) {
        Bus bus = new Bus(1, 1, 1, 10);
        bus.boardBus(2);
        bus.leaveBus(1);
        bus.move(5);
        System.out.println(bus.getFare());
    }
}
