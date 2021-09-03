package homework_6;

public class Cat extends Pet {

    public Cat(String name, int id, int age, int weight, boolean isVaccinated, Colours colours) {
        setName(name);
        setId(id);
        setAge(age);
        setWeight(weight);
        setVaccinated(isVaccinated);
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
        return objectClassName() + "{" + getName()
                +
                ", id=" + getId() +
                ", age=" + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                '}';
    }

    public void sound() {
        System.out.println("Me-o-w");
    }
}
