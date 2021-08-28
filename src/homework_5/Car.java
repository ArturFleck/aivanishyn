package homework_5;

public class Car {

    private double tankCapacity;
    private double fuelLeftInTank;
    private double fuelOfficiency;
    private int milesForDestinacion;
    private int gasCost = 31;

    public Car(double tankCapacity, double fuelLeftInTank, double fuelOfficiency) {
        this.tankCapacity = tankCapacity;
        this.fuelLeftInTank = fuelLeftInTank;
        this.fuelOfficiency = fuelOfficiency;
    }

    public Car(double tankCapacity, double fuelLeftInTank, double fuelOfficiency, int milesForDestinacion) {
        this.tankCapacity = tankCapacity;
        this.fuelLeftInTank = fuelLeftInTank;
        this.fuelOfficiency = fuelOfficiency;
        this.milesForDestinacion = milesForDestinacion;
    }


    public void fillTank() {
        double filling = tankCapacity - fuelLeftInTank;
        this.fuelLeftInTank = tankCapacity;
        double cost = gasCost * filling;
        System.out.println("You fill " + filling + " liters of fuel");
        System.out.println("It cost you " + cost + " hrn.");
    }

    public void run(int milege) {
        double m = milege/fuelOfficiency;
        fuelLeftInTank -= m;
        System.out.println("You run " + milege + "km");
    }

    public void whatLeftInTank(){
        System.out.println("In tank " + fuelLeftInTank +" liters of fuel");
    }

    public void trip(int milege){
        double fuelForTrip = milege/fuelOfficiency;

        if(fuelForTrip > fuelLeftInTank){
            double fuel = fuelForTrip - fuelLeftInTank;
            System.out.println("Not enough fuel");
            System.out.println("Needed fuel for trip " + fuelForTrip + "liters");
            whatLeftInTank();
            System.out.println("For trip your you need fo fill " + fuel + " liters of fuel");
        }else {
            double tank = fuelLeftInTank - fuelForTrip;
            System.out.println("After trip at " + milege + " km gonna left " + tank + " litest of fuel in your tank");
        }
    }

}

