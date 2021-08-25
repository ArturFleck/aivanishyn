package homework_3;

import java.util.Random;
import java.util.Scanner;

public class Task_9_10 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int[] array = new int[scan.nextInt()];

        System.out.println("The array is:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(999);
            System.out.print(array[i] + " ");
        }

        // Task 9
        int temp = array[0];
        for (int i = 0; i < array.length; i++) {

            if(temp>array[i]){
                temp=array[i];}
        }
        System.out.println("\n\nThe smallest number of array is: " + temp);

        //Task 10
        int temp2 = array[0];
        for (int i = 0; i < array.length; i++) {

            if(temp2<array[i]){
                temp2=array[i];}
        }
        System.out.print("The largest number of array is: " + temp2);

    }
}
