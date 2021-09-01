package homework_6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Blacky", 1, 3, 7,true);
        cat1.setColour(Colours.White);
        //System.out.println(cat1);
        cat1.voice();

        Cat cat2 = new Cat("Grady",2,7,9,false);
        cat2.setColour(Colours.Black);
        //System.out.println(cat2);
        cat2.voice();

        Dog dog1 = new Dog("Bulky", 12, 5, 25,true, true);
        dog1.setColour(Colours.Red);
        //System.out.println(dog1);
        dog1.voice();
        dog1.lead();

        Dog dog2 = new Dog("Brady", 3, 5, 37,false, false);
        dog2.setColour(Colours.Brown);
        //System.out.println(dog2);
        dog2.voice();
        dog2.lead();

        Fish fish = new Fish();
        fish.voice();

        Lion lion = new Lion(22,15,79,true);
        lion.voice();

        Wolf wolf = new Wolf(31,20,47,true);
        wolf.voice();

        Giraffe giraffe = new Giraffe(41,71,365,false);
        giraffe.voice();
    }
}
