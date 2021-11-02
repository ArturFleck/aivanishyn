package homework_21_2;

import java.util.Random;
import java.util.Scanner;

public class Account {
    Random rand = new Random();
    private int count = rand.nextInt(999);

    public synchronized void replenishment(int amount) {
        count += amount;
        System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (+): " + amount);
    }

    public synchronized void withdrawal(int amount) {
        if (count >= amount)
            count -= amount;
        else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " trying to get " + amount);
            System.out.print("Please enter the value you wanted to get: ");
            amount = sc.nextInt();
            if (amount > count) {
                amount = 0;
            }
            count -= amount;
        }
        System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
    }

    public synchronized int getCount() {
        return count;
    }

}
