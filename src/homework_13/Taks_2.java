package homework_13;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Taks_2 {
    public static void main(String[] args) {
        List<Box> box = new LinkedList<>();
        List<Box> LessThanThreeHundred = new LinkedList<>();

        fillingCollection(100, box);

        System.out.println(box.size());
        displayEachElement(box);
        filter(box,LessThanThreeHundred);

        System.out.println("-----------------");
        System.out.println("AFTER FILTER");

        System.out.println(box.size());
        displayEachElement(box);

        System.out.println("-----------------");
        System.out.println(LessThanThreeHundred.size());
        displayEachElement(LessThanThreeHundred);
    }

    public static void fillingCollection(int sizeOfArray, List<Box> box) {
        Random rand = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            box.add(i, (new Box(i, rand.nextInt(1000), rand.nextInt(1000), rand.nextInt(1000), rand.nextInt(1000))));
        }
    }

    public static void displayEachElement(List<Box> boxList) {
        for (Box box : boxList) {
            System.out.println(box);
        }
    }

    public static void filter(List<Box> box,List<Box> LessThanThreeHundred) {
        int counter=0;
        for (int i = 0; i < box.size(); i++) {
            if (box.get(i).weight <= 300) {
                //LessThanThreeHundred.add(new Box (counter,box.get(i).length,box.get(i).width,box.get(i).depth,box.get(i).weight));  // creating object with NEW id
                LessThanThreeHundred.add(box.get(i));   // creating adding in a new List with old id
                box.remove(i);
                counter++;
            }
        }
    }
}
