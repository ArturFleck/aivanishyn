package homework_2;

import java.sql.Array;
import java.util.Scanner;

public class Task2 {
    public void averageArray() {
        Scanner scanner = new Scanner(System.in);
        int a, i = 0;
        double total = 0;
        System.out.print("How many nubmers you gonna enter? ");
        a = scanner.nextInt();

        while (i < a) {
            System.out.print("Enter number: ");
            total += scanner.nextDouble();
            i++;
        }
        System.out.println("The average of entered numbers is: " + total / a);
    }
}
