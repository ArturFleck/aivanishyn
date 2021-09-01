package homework_6;

public class Cat extends Pet {

    public Cat(String name,int id, int age, int weight, boolean isVaccinated) {
        setName(name);
        setId(id);
        setAge(age);
        setWeight(weight);
        setVaccinated(isVaccinated);
    }

    public String toString() {
        int year = getAge();
        String years;
        if (year == 1) {
            years = year + " year old";
        } else {
            years = year + " years old";
        }
        return "\nCat{" + getName()
                +
                ", id=" + getId() +
                ", age=" + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                '}';
    }

    public void voice() {
        System.out.println("Meow");
    }

}
