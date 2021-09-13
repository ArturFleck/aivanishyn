package lesson_9;

public class TestCar {
    public static void main(String[] args) {
        CarV9 car = new CarV9("Odessa");
        car.resetTrip();
        car.fillFullTank(29.5d);
        car.drive(170,"Кривое Озеро");
        car.fillTank(20d,28d);
        car.drive(300,"Жашков");
        car.fillTank(10d,28d);
        car.drive(150,"Киев");
        car.printTripReport();

    }

}
