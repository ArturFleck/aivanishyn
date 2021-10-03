package homework_13;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Taks_2 {
    public static void main(String[] args) {
        List<Box> BOX = new LinkedList<>();
        List<Box> LessThanThreeHundred = new LinkedList<>();

        fillingCollection(100, BOX);

        System.out.println(BOX.size());
        displayEachElement(BOX);
        filter(BOX,LessThanThreeHundred);

        System.out.println("-----------------");
        System.out.println("AFTER FILTER");

        System.out.println(BOX.size());
        displayEachElement(BOX);

        System.out.println("-----------------");
        System.out.println(LessThanThreeHundred.size());
        displayEachElement(LessThanThreeHundred);
    }

    public static void fillingCollection(int sizeOfArray, List<Box> BOX) {
        Random rand = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            BOX.add(i, (new Box(i, rand.nextInt(1000), rand.nextInt(1000), rand.nextInt(1000), rand.nextInt(1000))));
        }
    }

    public static void displayEachElement(List<Box> BOX) {
        for (Box box : BOX) {
            System.out.println(box);
        }
    }

    public static void filter(List<Box> BOX,List<Box> LessThanThreeHundred) {
        int counter=0;
        for (int i = 0; i < BOX.size(); i++) {
            if (BOX.get(i).weight <= 300) {
                LessThanThreeHundred.add(new Box (counter,BOX.get(i).length,BOX.get(i).width,BOX.get(i).depth,BOX.get(i).weight));
                BOX.remove(i);
                counter++;
            }
        }
    }
}
