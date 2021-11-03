package homework_21_2;

import java.util.Scanner;

public class Manager {

    public static void put(Account acc) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">> Master, please enter the value of replenishment: ");
        int amount = sc.nextInt();
        acc.replenishment(amount);
    }
}
