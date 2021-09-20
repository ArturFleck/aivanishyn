package homework_9.refarcoringHW6;

public interface Voice {

    default String makeVoice() {
        return "Hello, I'm ";
    }

}
