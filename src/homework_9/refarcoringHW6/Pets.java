package homework_9.refarcoringHW6;

public class Pets extends GroundAnimal {
    protected String name;
    protected boolean isVaccinated;
    protected boolean isTrained;

    @Override
    public String makeVoice() {
        return (super.makeVoice()
                .concat(objectClassName())
                .concat((name != null) ? String.format("\nMy name is %s. ", name) : ""))
                .concat("\nI'm pet animal. ");
    }
}
