package homework_4;

import java.util.Random;
import java.util.Scanner;

public class Task_9_12 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] array = new int[scan.nextInt()];
        double counter = 0;
        System.out.println("The array is:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(99);
            System.out.print(array[i] + " ");
            counter += array[i];
        }
        System.out.println("\nThe average of array is: " + counter / array.length); // Task 12

        //Combined Tasks 9-11
        int min = array[0];
        int max = array[0];
        int indexMin = 0;
        int indexMax = 0;
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
                indexMin = j;
            }
            if (max < array[j]) {
                max = array[j];
                indexMax = j;
            }
        }
        System.out.println("\nThe smallest number of array is: " + min /*+ " at position: " + indexMin*/);
        System.out.print("The largest number of array is: " + max /*+ " at position: " + indexMax*/);

        array[indexMin] = max;
        array[indexMax] = min;

        System.out.println("\n\nChanging positions min <> max\nArray after changing:");
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
