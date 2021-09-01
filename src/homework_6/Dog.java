package homework_6;

public class Dog extends Pet {

    private boolean trained;

    public Dog(String name) {
        super(name);
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String toString() {
        int year = getAge();
        String years;
        if (year == 1) {
            years = " year old";
        } else {
            years = " years old";
        }

        return "\nDog{" +
                "id=" + getId() +
                ", age=" + year + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                " trained=" + trained +
                '}';
    }

    public void lead() {
        if (trained) {
            System.out.println("I can take you home. Follow me...");
        } else {
            System.out.println("This dog is not trained");
        }
    }

    public void voice() {
        System.out.println("Bark");
    }
}
