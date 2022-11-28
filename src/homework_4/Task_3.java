package homework_4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        task1();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        task2(scan.nextInt());
    }

    public static void task1() {
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }
    }

    public static void task2(int f) {
        int temp;
        if (f == 1 || f == 0) {
            System.out.println("Factorial of number " + f + "! is 1");
        } else {
            temp = 1;
            int j = 1;
            while (j < f) {
                //System.out.println(j + " " + temp);
                temp += (j * temp);
                j++;
            }
            System.out.println("Factorial of number " + f + "! is " + temp);
        }
    }

}
