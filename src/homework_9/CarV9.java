package homework_9;

import java.util.Random;

public class CarV9 {
    double rand = new Random().nextDouble();

    double tripDistance = 0;
    double tripMoneySpent = 0;
    String location = "Odessa";
    double tankCapacity = 30 + (rand * (60 - 30));
    double currentFuelLevel = (tankCapacity / 100) * (10 + (rand * 40));
    double fuelConsumption = 5 + (rand * (15 - 5));

    public void setTripDistance(double i) {
        tripDistance += i;
    }

    public Object getFuelInTank() {
        return currentFuelLevel;
    }

    public void fillFullTank(double fuelPrice) {
        fillTank(availableSpaceInTank(), fuelPrice);
    }

    public void fillTank(double liters, double fuelPrice) {
        if (liters > availableSpaceInTank()) {
            //System.out.println("Fill " + availableSpaceInTank());
            currentFuelLevel = tankCapacity;
            tripMoneySpent += (availableSpaceInTank() * fuelPrice);
        } else {
            currentFuelLevel += liters;
            tripMoneySpent += (liters * fuelPrice);
            //System.out.println("Fill " + liters);
        }
        //System.out.println("Spent $ "+tripMoneySpent);
    }

    public void drive(double distance, String destination) {
        System.out.printf("We are going to %s. %s km...", destination, distance);
        location = destination;
        currentFuelLevel -= ((distance / 100) * fuelConsumption);
        setTripDistance(distance);
    }

    public void printTripReport() {
        System.out.println("\nCurrent fuel level "+ String.format("%.2f",currentFuelLevel) +"liters. Distance was spent " + tripDistance + "km. Money Spent " + String.format("%.2f",tripMoneySpent) + "hrn. Location " + location);
    }

    private double availableSpaceInTank() {
        return tankCapacity - currentFuelLevel;
    }

    @Override
    public String toString() {
        return "CarV9{" +
                "tripDistance=" + tripDistance +
                ", tripMoneySpent=" + tripMoneySpent +
                ", location='" + location + '\'' +
                ", tankCapacity=" + String.format("%.2f",tankCapacity) +
                ", currentFuelLevel=" + String.format("%.2f",currentFuelLevel) +
                ", fuelConsumption=" + String.format("%.2f",fuelConsumption) +
                '}';
    }
}
