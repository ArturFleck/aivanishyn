package homework_9.refarcoringHW6;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish(1,3,2,"Green");
        System.out.println(fish);
        System.out.println(fish.makeVoice());
        fish.sound();
        fish.swim();
        System.out.println("----------------------------");

        Dog dog = new Dog(2,10,25,"Grey","Sam", true,true);
        System.out.println(dog);
        System.out.println(dog.makeVoice());
        dog.sound();
        dog.swim();
        System.out.println("----------------------------");

        Cat cat = new Cat(3,7,8,"Red","Lucky",true,false);
        System.out.println(cat);
        System.out.println(cat.makeVoice());
        cat.swim();
        System.out.println("----------------------------");

        Wild.Wolf wolf = new Wild.Wolf(4,5,65,true,"White");
        System.out.println(wolf);
        System.out.println(wolf.makeVoice());
        wolf.hungry();
        wolf.sound();
        wolf.swim();


        System.out.println("----------------------------");
        Wild.Giraffe giraffe = new Wild.Giraffe(5,25,275,false,"Yellow");
        System.out.println(giraffe);
        System.out.println(giraffe.makeVoice());
        giraffe.hungry();
        giraffe.sound();
        giraffe.swim();

    }
}