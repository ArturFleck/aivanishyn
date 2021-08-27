package homework_5;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(60,55,12,478,178,150);

        System.out.println(car1.getFuelLeftInTank());


    }

    public static double fillTank(double tankCapacity, double fuelLeftInTank) {
        double x = tankCapacity;
        double y = fuelLeftInTank;
        return x - y;
    }
}
