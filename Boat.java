package Boat;
public class Boat {
    private String name;
    private int passengerCapacity;
    private int currentPassengers;
    public Boat(String name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.currentPassengers = 0;
    }
    public void boardPassengers(int numPassengers) {
        if (currentPassengers + numPassengers <= passengerCapacity) {
            currentPassengers += numPassengers;
            System.out.println(numPassengers + " passengers boarded. Current passengers: " + currentPassengers);
        } else {
            System.out.println("Not enough capacity. Cannot board " + numPassengers + " passengers.");
        }
    }
    public void disembarkPassengers(int numPassengers) {
        if (currentPassengers >= numPassengers) {
            currentPassengers -= numPassengers;
            System.out.println(numPassengers + " passengers disembarked. Current passengers: " + currentPassengers);
        } else {
            System.out.println("Not enough passengers to disembark.");
        }
    }
    public static void main(String[] args) {
        Boat boat = new Boat("Large Ferry", 400);
        boat.boardPassengers(200);
        boat.disembarkPassengers(50);
        boat.boardPassengers(250);
    }
}        