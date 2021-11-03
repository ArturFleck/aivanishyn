package homework_21_2;

import java.util.Scanner;

public class Account {

    public int flag = 0;
    private int count;

    Account(int balance) {
        this.count = balance;
    }

    public synchronized void replenishment(int amount) {
        System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (+): " + amount);
        count += amount;
        notify();
        flag=0;
    }

    public synchronized void withdrawal(int amount) {
        if (count >= amount) {
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
            count -= amount;
        } else {
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount + "   WAIT...");

            try {
                flag++;
                wait();
                System.out.println(Thread.currentThread().getName() +"  " + Thread.currentThread().getState());
            } catch (InterruptedException e) {

            }
        }

    }

    public synchronized int getCount() {
        return count;
    }
}
