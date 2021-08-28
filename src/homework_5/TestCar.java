package homework_5;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car(60,25,12,478);
        //178
        //150
        car1.fillTank();
        car1.whatLeftInTank();
        car1.run(178);
        car1.whatLeftInTank();
        car1.run(150);
        car1.whatLeftInTank();
        car1.run(150);
        car1.whatLeftInTank();

        System.out.println();
        car1.trip(250);

        car1.fillTank();
        System.out.println();

        car1.trip(250);
    }

}
