package homework_21_2;

import java.util.Scanner;

public class Manager {

    public static void put(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Muster please enter value: ");
        int amount = sc.nextInt();
        acc.replenishment(amount);
        System.out.println("Balance after Managing: " + acc.getCount());
    }
}
