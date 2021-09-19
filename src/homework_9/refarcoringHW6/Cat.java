package homework_9.refarcoringHW6;

public class Cat extends Pets{

    @Override
    public String makeVoice() {
        return (super.makeVoice()
                .concat(isTrained ? "\nI can catch a bird" : ""));
    }

    @Override
    public String swim() {
        System.out.println("I can swim but I don't like to do it");
        return null;
    }

    @Override
    public void sound() {
        System.out.println("Meow.");
    }

    public Cat(int id, int age, int weight,String  colours, String name, boolean isVaccinated, boolean isTrained) {
        this.colour=colours;
        this.id=id;
        this.age=age;
        this.weight=weight;
        this.name = name;
        this.isVaccinated = isVaccinated;
        this.isTrained=isTrained;
    }
}
