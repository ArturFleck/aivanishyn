package homework_6;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Blacky");
        cat1.setId(0);
        cat1.setAge(3);
        cat1.voice();
        cat1.setColour("Gray");
        cat1.setWeight(5);
        System.out.println(cat1);

        Cat cat2 = new Cat("Grady");
        cat2.setId(1);
        cat2.setAge(1);
        cat2.voice();
        cat2.setColour("Black");
        cat2.setWeight(3);
        System.out.println(cat2);

        Dog dog1= new Dog("Bulky");
        dog1.setTrained(true);
        dog1.setAge(12);
        dog1.setColour("Red");
        dog1.setId(3);
        dog1.setWeight(25);
        System.out.println(dog1);
        dog1.lead();

        Dog dog2= new Dog("Brady");


        System.out.println(dog2);
        dog2.lead();

    }
}
