package homework_13;

public class Box {

    protected int ID;
    protected int length;
    protected int width;
    protected int depth;
    protected int weight;

    public Box(int ID, int length, int width, int depth, int weight) {
        this.ID = ID;
        this.length = length;
        this.width = width;
        this.depth = depth;
        this.weight = weight;
    }

    @Override
    public String toString() {
        String l1 = String.valueOf(length);
        int l2 = l1.length();
        String tab1 = "";
        if (l2 == 2) {
            tab1 = " ";
        }

        String w1 = String.valueOf(width);
        int w2 = w1.length();
        String tab2 = " ";
        if (w2 == 2) {
           tab2 = " ";
        }

        String d1 = String.valueOf(depth);
        int d2 = d1.length();
        String tab3 = "";
        if (d2 == 2) {
            tab3 = " ";
        }

        return "Box{" +
                "ID=" + ID +
                ",\t\tlength=" + length + "," + tab1 +
                "\t\twidth=" + width + "," + tab2 +
                "\t\tdepth=" + depth + "," + tab3 +
                "\t\tweight=" + weight +
                '}';
    }
}
