package homework_9.refarcoringHW6;

public interface Swim {
    default String swim(){
        System.out.println("Not defined method of Swim");
        return null;
    }
}
