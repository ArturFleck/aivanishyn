package homework_6;

public class Wild extends Ground {

    private boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }


    public void voice() {
        System.out.print("\nI'm a wild animal. I'm " + objectClassName());
        hungry();
    }

    public void hungry() {
        if (isPredator) {
            System.out.println("\nI'm angry and want some meat.");
        } else {
            System.out.println("\nand I'm eating grass or leaves.");
        }
    }

    public String toString() {

        int year = getAge();
        String years;
        if (year == 1) {
            years = year + " year old";
        } else {
            years = year + " years old";
        }
        return objectClassName() +
                "{id=" + getId() +
                ", age=" + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                '}';
    }

}
