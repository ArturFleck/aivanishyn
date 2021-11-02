package homework_21_2;

import java.util.Scanner;

public class Account {


    private int flag = 0;
    private int count;

    Account(int balance) {
        this.count = balance;
    }

    public synchronized void replenishment(int amount) {
        System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (+): " + amount);
        count += amount;
        notify();
    }

    public synchronized void withdrawal(int amount) {
        if (count >= amount) {
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
            count -= amount;
        } else {
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount + "   WAIT...");
            try {
                wait();
                if (flag >= 2) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Manager Replenishment balance: ");
                    amount = sc.nextInt();
                    count += amount;
                    flag = -1;
                    notifyAll();
                }
                flag++;
            } catch (InterruptedException e) {
            }
        }
    }

    public synchronized int getCount() {
        return count;
    }
}
