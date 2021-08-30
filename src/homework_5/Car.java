package homework_5;

public class Car {

    private double tankCapacity;
    private double fuelLeftInTank;
    private double fuelOfficiency;
    private int milesForDestinacion;
    private double gasCost = 31;

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

    // Filling tank till full capacity of gas
    public void fillTank() {
        double filling = tankCapacity - fuelLeftInTank;
        this.fuelLeftInTank = tankCapacity;
        double cost = gasCost * filling;
        System.out.println("You fill " + roundUp(filling) + " liters of fuel.");
        System.out.println("It cost you " + roundUp(cost) + " hrn.");
        whatLeftInTank();
    }

    // Filling tank by input value
    public void fillTank(double gas) {
        if((fuelLeftInTank + gas)>tankCapacity)
        {
            gas = tankCapacity-fuelLeftInTank;
        }

        double filling = fuelLeftInTank + gas;
        this.fuelLeftInTank = filling;
        double cost = gasCost * filling;
        System.out.println("You fill " + roundUp(gas) + " liters of fuel.");
        System.out.println("It cost you " + roundUp(cost) + " hrn.");
        whatLeftInTank();
    }

    public void run(int milege) {
        double m = milege / fuelOfficiency;
        fuelLeftInTank -= m;
        System.out.println("\nYou run " + milege + "km. Was spend " + roundUp(m) + " liters of fuel, that cost " + costOfLiter(m)+" hrn.\n");
    }

    public void whatLeftInTank() {
        System.out.println("In tank " + roundUp(fuelLeftInTank) + " liters of fuel.");
        draft(fuelLeftInTank);
    }

    public void trip(int milege) {
        double fuelForTrip = milege / fuelOfficiency;

        if (fuelForTrip > fuelLeftInTank) {
            double fuel = fuelForTrip - fuelLeftInTank;
            System.out.println("Not enough fuel for trip at " + milege + "km.");
            System.out.println("Needed fuel for trip " + roundUp(fuelForTrip) + " liters.");
            whatLeftInTank();
            System.out.println("For trip you need fo fill " + roundUp(fuel) + " liters of fuel. That gonna cost to you " + costOfLiter(fuelForTrip)+" hrn.\n");
        } else {
            double tank = fuelLeftInTank - fuelForTrip;
            System.out.println("After trip at " + milege + " km gonna left " + roundUp(tank) + " liters of fuel in your tank.\n");
        }
    }

    public static double roundUp(double number) {
        return ((double) Math.round(number * 100) / 100);
    }

    public double costOfLiter(double m){
        return roundUp(m*gasCost);
    }


    public void draft(double cap) {
        cap /= tankCapacity;
        cap *= 100;
        cap /= 2;
        cap =(int)cap / 10;
        if (cap == 5) {
            System.out.println("E|" + "*" + "*" + "*" + "*" + "*" + "|F");
        }
        if (cap == 4) {
            System.out.println("E|" + "*" + "*" + "*" + "*" + "_" + "|F");
        }
        if (cap == 3) {
            System.out.println("E|" + "*" + "*" + "*" + "_" + "_" + "|F");
        }
        if (cap == 2) {
            System.out.println("E|" + "*" + "*" + "_" + "_" + "_" + "|F");
        }
        if (cap == 1) {
            System.out.println("E|" + "*" + "_" + "_" + "_" + "_" + "|F");
        }
        if (cap == 0) {
            System.out.println("E|" + "_" + "_" + "_" + "_" + "_" + "|F");
        }
    }

}

