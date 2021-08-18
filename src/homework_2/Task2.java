package homework_2;

import java.util.Random;
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

        total = 0;
        i = 0;

        while (i < a) {
            Random rand = new Random();
            total += rand.nextInt(999);
            i++;
        }
        System.out.println("\nThe average of random " + a + " numbers is: " + total / a);

    }
}
