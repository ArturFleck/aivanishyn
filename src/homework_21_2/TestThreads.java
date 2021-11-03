package homework_21_2;

import java.util.Random;
import java.util.Scanner;

public class TestThreads {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Account account = new Account(rand.nextInt(100));
        int cycle = 20;         // how many cycles we want for each thread ?
        int maxGet = 100;     // max value for -
        int maxPut = 50;     // max value for +

        Runnable task1 = () -> fill(account, cycle, maxGet, maxPut);
        Runnable task2 = () -> fill(account, cycle, maxGet, maxPut);
        Runnable manager = () -> {
            while (true) {
                if (account.flag > 1)
                    System.out.println("manager");
                Manager.fill();
                account.flag=0;
                Account.class.notifyAll();
                //Thread.sleep(300);
            }
        };

        System.out.println("Value in account before start: " + account.getCount());

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(manager);

        thread1.setName("TH-1");
        thread2.setName("TH-2");
        thread3.setName("MANAGER");

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();

        System.out.println("Value in account after finish: " + account.getCount());
    }

    public static void fill(Account account, int cycle, int maxGet, int maxPut) {
        Random rand = new Random();
        for (int i = 0; i < cycle; i++) {
            if (rand.nextBoolean()) {
                account.replenishment(rand.nextInt(maxPut));
            } else {
                account.withdrawal(rand.nextInt(maxGet));
                Thread.yield();
            }
        }
    }

}
