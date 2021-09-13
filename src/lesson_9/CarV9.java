package lesson_9;

public class CarV9 {

    String location;
    double moneySpent;
    double currentFuelLevel;
    double tankCapacity;
    double consumptionPer100km;
    double tripKm;

    public CarV9(String location) {
    }

    public void resetTrip() {
        System.out.println("Zeroing");
    }

    public void fillFullTank(double price) {
        System.out.println("\nFilling full tank");
        fillTank(availableSpaceInTank(),price);

    }
    public void fillTank(double liters, double price) {
        System.out.printf("\nFilling %s liters by price %s ",liters,price);
        double maxToFill = availableSpaceInTank();
        if (liters>maxToFill){
            liters=maxToFill;
        }
    }

    public void drive(int distance, String destination) {
        System.out.printf("\nDrived %s km to %s ",distance,destination);
    }

    public void printTripReport() {
        System.out.println("\nHere's gonna be report");
    }

    private double availableSpaceInTank(){
        return tankCapacity - currentFuelLevel;
    }
}
