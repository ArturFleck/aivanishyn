package homework_5;

public class Car {

    private double tankCapacity;
    private double fuelLeftInTank;
    private double fuelOfficiency;
    private int milesForDestinacion;
    private int milegeTillFirstStop;
    private int milegeTillSecondStop;
    private int gasCost = 31;

    public Car(double tankCapacity, double fuelLeftInTank, double fuelOfficiency, int milesForDestinacion, int milegeTillFirstStop, int milegeTillSecondStop) {
        this.tankCapacity = tankCapacity;
        this.fuelLeftInTank = fuelLeftInTank;
        this.fuelOfficiency = fuelOfficiency;
        this.milesForDestinacion = milegeTillSecondStop;
        this.milegeTillFirstStop = milegeTillFirstStop;
        this.milegeTillSecondStop = milegeTillSecondStop;
    }

    public double getFuelLeftInTank() {
        return fuelLeftInTank;
    }

    public void setFuelLeftInTank(double fuelLeftInTank) {
        this.fuelLeftInTank = fuelLeftInTank;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelOfficiency() {
        return fuelOfficiency;
    }

    public int getMilesForDestinacion() {
        return milesForDestinacion;
    }

    public int getMilegeTillFirstStop() {
        return milegeTillFirstStop;
    }

    public int getMilegeTillSecondStop() {
        return milegeTillSecondStop;
    }

    public int getGasCost() {
        return gasCost;
    }

}

