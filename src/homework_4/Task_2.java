package homework_4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int f = scan.nextInt();
        int temp = 0;
        if (f == 1 || f == 0) {
            System.out.println("Factorial of number " + f + "! is 1");
        } else {
            temp = 1;
            for (int i = 1; i < f; i++) {
                temp += (i * temp);
            }
            System.out.println("Factorial of number " + f + "! is " + temp);
        }
    }
}
