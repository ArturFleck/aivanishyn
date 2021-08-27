package homework_4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        task1();

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        task2(scan.nextInt());
    }

    public static void task1() {
        int i = 0;
        do {
            if (i % 2 != 0)
                System.out.println(i);
            i++;
        }while (i < 100);
    }

    public static void task2(int f) {
        if (f == 1 || f == 0) {
            System.out.println("Factorial of number " + f + "! is 1");
        } else {
            int temp = 1;
            int j = 1;
            do {
                temp += (j * temp);
                j++;
            }while (j < f);
            System.out.println("Factorial of number " + f + "! is " + temp);
        }
    }
}
