package homework_6;

public class Lion extends Wild{

    public Lion(int id, int age, int weight, boolean predator) {
        setId(id);
        setAge(age);
        setWeight(weight);
        setPreadtor(predator);
    }

    public void voice() {

        System.out.print("\nI'm a wild animal. I'm Lion");
        hungry();

    }

}
