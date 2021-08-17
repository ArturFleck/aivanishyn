package homework_2;

import java.util.Scanner;

public class Task1 {
    public void averageNumbers() {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        System.out.print("Enter first number: ");
        a = scanner.nextDouble();
        System.out.print("Enter second number: ");
        b = scanner.nextDouble();
        System.out.println("The average of entered numbers is: " + (a + b) / 2);
    }
}
