package homework_21;

import java.util.Random;

public class TestThreads {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Account account = new Account();
        int cycle = 20;         // how many cycles we want for each thread ?
        int boundary = 100;     // max value for +/-

        Runnable task1 = () -> {
            for (int i = 0; i < cycle; i++) {
                if (rand.nextBoolean()) {
                    account.replenishment(rand.nextInt(boundary));
                } else {
                    account.withdrawal(rand.nextInt(boundary));
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Runnable task2 = () -> {
            for (int i = 0; i < cycle; i++) {
                if (rand.nextBoolean()) {
                    account.replenishment(rand.nextInt(boundary));
                } else {
                    account.withdrawal(rand.nextInt(boundary));
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        System.out.println("Value in account before start: " + account.getCount());

        Thread tread1 = new Thread(task1);
        Thread tread2 = new Thread(task2);

        tread1.setName("TH-1");
        tread2.setName("TH-2");

        tread1.start();
        tread2.start();

        tread1.join();
        tread2.join();

        System.out.println("Value in account after finish: " + account.getCount());
    }

}
