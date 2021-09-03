package homework_6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Blacky", 1, 3, 7, true, Colours.White);
        cat1.voice();
        System.out.println(cat1);

        Cat cat2 = new Cat("Grady", 2, 7, 9, false, Colours.Black);
        cat2.voice();
        System.out.println(cat2);

        Dog dog1 = new Dog("Bulky", 12, 5, 25, true, true, Colours.Red);
        dog1.voice();
        dog1.lead();
        System.out.println(dog1);

        Dog dog2 = new Dog("Brady", 3, 5, 37, false, false, Colours.Brown);
        dog2.voice();
        dog2.lead();
        System.out.println(dog2);

        Fish fish1 = new Fish();
        fish1.voice();
        System.out.println(fish1);

        Fish fish2 = new Fish(55, 2, 8, Colours.Green);
        fish2.voice();
        System.out.println(fish2);

        Lion lion = new Lion(22, 15, 79, true, Colours.Yellow);
        lion.voice();
        System.out.println(lion);

        Wolf wolf = new Wolf(31, 20, 47, true, Colours.Gray);
        wolf.voice();
        System.out.println(wolf);

        Giraffe giraffe = new Giraffe(41, 71, 365, false, Colours.Yellow);
        giraffe.voice();
        System.out.println(giraffe);
    }
}
