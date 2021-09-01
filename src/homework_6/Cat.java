package homework_6;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    public String toString() {
        int year=getAge();
        String years;
        if (year==1){
            years=" year old";
        }
        else
        {
            years=" years old";
        }
        return "\nCat{" +
                "id=" + getId() +
                ", age=" + year + years +
                ", weight=" + getWeight() +
                "kg, colour='" + getColour() + '\'' +
                '}';
    }

    public void voice(){
        System.out.println("Meow");
    }


}
