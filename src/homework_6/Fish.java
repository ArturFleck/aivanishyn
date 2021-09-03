package homework_6;

public class Fish extends Water {

    public Fish() {
    }

    public Fish(int id, int age, int weight, Colours colours) {
        setId(id);
        setAge(age);
        setWeight(weight);
        setColour(colours);
    }

    public String toString() {
        int year = getAge();
        String years;
        if (year == 1) {
            years = year + " year old";
        } else {
            years = year + " years old";
        }
        return objectClassName() + "{" +
                "id=" + getId() +
                ", age=" + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                '}';
    }

    public void voice() {
        System.out.println("\nHi there I'm " + objectClassName() + ".");
        sound();
    }

    public void sound() {
        System.out.println("O-o-O-o-o-o-O-o-0");
    }

}
