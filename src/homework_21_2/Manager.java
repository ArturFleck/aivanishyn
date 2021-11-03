package homework_21_2;

import java.util.Scanner;

public class Manager {

    public static void fill() {

        Account acc = new Account(0);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value: ");
        int amount = sc.nextInt();
        acc.replenishment(amount);
        System.out.print("Replenishment balance: " + amount);
    }
}
