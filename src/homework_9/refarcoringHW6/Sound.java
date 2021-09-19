package homework_9.refarcoringHW6;

public interface Sound {
    default void sound() {
        System.out.println("Not defined method of Sound");
    }
}
