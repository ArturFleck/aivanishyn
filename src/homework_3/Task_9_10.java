package homework_3;

import java.util.Random;
import java.util.Scanner;

public class Task_9_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] array = new int[scan.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(999);
            System.out.print(array[i] + " ");
        }

        // Task 9

        int temp = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]<array[i+1])
                temp=array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j])
                    if (array[j] < temp)
                    temp = array[j];
                else
                    if (array[i] <temp)
                    temp = array[i];
            }
        }

        System.out.println("\n" + temp);


    }
}
