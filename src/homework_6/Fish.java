package homework_6;

public class Fish extends Water{

    public String toString() {
        int year = getAge();
        String years;
        if (year == 1) {
            years = year + " year old";
        } else {
            years = year + " years old";
        }
        return "\nFish{" +
                "id=" + getId() +
                ", age=" + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                '}';
    }

    public void voice(){
        System.out.println("-----");
    }

}
