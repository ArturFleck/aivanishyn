package homework_6;

public class Animals {

    private int id;
    private int age;
    private double weight;
    Colours colour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Colours getColour() {
        return colour;
    }

    public void setColour(Colours colour) {
        this.colour = colour;
    }

    public void sound() {
    }

    public String objectClassName(){
        String str = this.getClass().getName();     // catching class name of object what's called
        String[] words = str.split("6.");
        String name = (words[1]);
        return name;
    }

}
