package homework_9.refarcoringHW6;

public class Animals implements Sound,Swim, Voice {
    protected int id;
    protected int age;
    protected int weight;
    String colour;

/*    public String makeVoice() {
        return "Hello, I'm " + objectClassName()+". ";
    }*/

    public String objectClassName(){
        String str = this.getClass().getName();     // catching class name of object what's called
        String[] words = str.split("6.");
        String name = (words[1]);
        return name;
    }

    public String toString() {
        return objectClassName()+"{" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", colour='" + colour + '\'' +
                '}';
    }
}
