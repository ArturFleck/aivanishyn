package homework_9.refarcoringHW6;

public class Fish extends WaterAnimals{

    public Fish(int id, int age, int weight, String colours) {
        this.colour=colours;
        this.id=id;
        this.age=age;
        this.weight=weight;
    }

    @Override
    public String makeVoice() {
        return super.makeVoice().concat(" and I can swim");
    }

    public void sound(){
        System.out.println("0-o-o-0-o-O-o-0-O-0-o-o-");
    }
}
