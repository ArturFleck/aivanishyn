package homework_9.refarcoringHW6;

public class Dog extends Pets{
    @Override
    public String makeVoice() {
        return (super.makeVoice().concat("\nI have owner")
                .concat(isTrained ? "\nI can lead you home" : ""));
    }

    @Override
    public String swim() {
        System.out.println("I can and love to swim");
        return null;
    }

    @Override
    public void sound() {
        System.out.println("Woof.");
    }

    public Dog(int id, int age, int weight,String  colours, String name, boolean isVaccinated, boolean isTrained) {
        this.colour=colours;
        this.id=id;
        this.age=age;
        this.weight=weight;
        this.name = name;
        this.isVaccinated = isVaccinated;
        this.isTrained=isTrained;
    }
}
