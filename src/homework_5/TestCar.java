package homework_5;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(60,25,12,478);

        car1.trip(478); // calculating how many fuel left after trip

        car1.whatLeftInTank();
        car1.fillTank();
        // From Odessa to Kiev 478km
        //1st stop 178km
        //2nd stop 150km

        car1.run(178);
        car1.whatLeftInTank();
        car1.run(150);
        car1.whatLeftInTank();
        car1.run(150);
        car1.whatLeftInTank();

        car1.fillTank(20);

    }
}
