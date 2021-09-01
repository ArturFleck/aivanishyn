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

    public void voice() {
        String str = this.getClass().getName();
        String[] words = str.split("6.");
        System.out.println("\nHi there I'm " + words[1] + ".");
        sound();
    }

    public void sound(){
        System.out.println("O-o-O-o-o-o-O-o-0");
    }


}
