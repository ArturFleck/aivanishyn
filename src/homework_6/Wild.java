package homework_6;

public class Wild extends Ground {

    private boolean isPreadtor;

    public boolean isPreadtor() {
        return isPreadtor;
    }

    public void setPreadtor(boolean preadtor) {
        isPreadtor = preadtor;
    }


    public void voice() {
        String str = this.getClass().getName();
        String[] words = str.split("6.");
        //System.out.println(words[1]);
        System.out.print("\nI'm a wild animal. I'm " + words[1]);
        hungry();
    }

    public void hungry() {

        if (isPreadtor) {
            System.out.println(" and I am angry.");
        } else {
            System.out.println(" and I'm eating grass of leaves.");
        }
    }
}
