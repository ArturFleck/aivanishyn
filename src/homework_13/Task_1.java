package homework_13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        List<Integer> arr2 = new LinkedList<>();
        int size = 1000000;

        long start = 0L;
        long end = 0L;

        start = System.currentTimeMillis();
        putInArray(arr, size);
        end = System.currentTimeMillis();
        System.out.println("Filling ArrayList: " + (end - start));

        start = System.currentTimeMillis();
        putInArray(arr2, size);
        end = System.currentTimeMillis();
        System.out.println("Filling LinkedList: " + (end - start));

        start = System.currentTimeMillis();
        getFromArray(arr);
        end = System.currentTimeMillis();
        System.out.println("\nGetting from ArrayList: " + (end - start) + " milliseconds");     // 789 milliseconds

        start = System.currentTimeMillis();
        getFromArray(arr2);
        end = System.currentTimeMillis();
        System.out.println("\nGetting from LinkedList: " + (end - start)+ " milliseconds");     // 112718 milliseconds
    }

    public static void putInArray(List<Integer> arr, int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr.add(i, rand.nextInt(999));
        }
    }

    public static void getFromArray(List<Integer> arr) {
        Random rand = new Random();
        for (int i = 0; i < 100000; i++) {
            System.out.print(arr.get(rand.nextInt(arr.size())) + " ");
        }
/*        for (Integer integer : arr) {
            System.out.println(integer);
        }*/
    }
}
