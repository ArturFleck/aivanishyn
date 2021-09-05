package homework_6;

public class Pet extends Ground {
    private String name;
    private boolean isVaccinated;

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }


    public void voice() {
        System.out.println("\nHi there I'm " + objectClassName() + ".");
        System.out.println("My name is " + getName());
        sound();
    }

}
