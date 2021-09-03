package homework_6;

public class Dog extends Pet {

    private boolean trained;

    public Dog(String name, int id, int age, int weight, boolean isVaccinated, boolean trained, Colours colours) {
        setName(name);
        setId(id);
        setAge(age);
        setWeight(weight);
        setVaccinated(isVaccinated);
        setTrained(trained);
        setColour(colours);
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String toString() {
        int year = getAge();
        String years;
        if (year == 1) {
            years = year + " year old";
        } else {
            years = year + " years old";
        }

        return objectClassName() + "{" + getName()
                +
                ", id=" + getId() +
                ", age=" + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                " trained=" + trained +
                '}';
    }

    public void lead() {
        if (trained) {
            System.out.println("I can take you home. Follow me...");
        } else {
            System.out.println("I'm not trained");
        }
    }

    public void sound() {
        System.out.println("Woof Woof");
    }
}
