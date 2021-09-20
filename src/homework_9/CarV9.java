package homework_9;

import java.util.Random;

public class CarV9 {
    double rand = new Random().nextDouble();

    double tripDistance = 0;
    double tripMoneySpent = 0;
    String location;
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
            currentFuelLevel = tankCapacity;
            tripMoneySpent += (availableSpaceInTank() * fuelPrice);
        } else {
            currentFuelLevel += liters;
            tripMoneySpent += (liters * fuelPrice);
        }
    }

    public void drive(double distance, String destination) {

        if (currentFuelLevel-((distance / 100) * fuelConsumption)>0)
        {
            System.out.printf("We are going to %s. %s km...", destination, distance);
            location = destination;
            currentFuelLevel -= ((distance / 100) * fuelConsumption);
            setTripDistance(distance);
        }
        else{
            throw new IllegalArgumentException("Not Enough Fuel");
        }
    }

    public void printTripReport() {
        System.out.println("\nCurrent fuel level " + format(currentFuelLevel) + "liters. Distance was spent " + tripDistance + "km. Money Spent " + format(tripMoneySpent) + "hrn. Location " + location);
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
                ", tankCapacity=" + String.format("%.2f", tankCapacity) +
                ", currentFuelLevel=" + String.format("%.2f", currentFuelLevel) +
                ", fuelConsumption=" + String.format("%.2f", fuelConsumption) +
                '}';
    }

    public static String format(double text) {
        return String.format("%.2f", text);
    }
}
