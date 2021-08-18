package homework_2;

import java.util.Scanner;

public class Task3 {
    public void banking() {
        int money = 0;
        int percent = 0;
        int inYear = 0;
        int total = 0;
        int years = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount money you put on your account: ");
        money = scanner.nextInt();
        System.out.print("Enter percent of year payments : ");
        percent = scanner.nextInt();
        System.out.print("Enter how many years you make deposition : ");
        years = scanner.nextInt();
        System.out.println();

        total = money * 100;

        int i = 1;
        while (i <= years) {
            inYear = (total * percent)/100;
            total += inYear;
            System.out.println("At the end of year: " + i);
            System.out.println("Percent is: " + ((double) inYear / 100));
            System.out.println("Total is: " + ((double) total / 100));
            System.out.println();
            i++;
        }
    }
}
