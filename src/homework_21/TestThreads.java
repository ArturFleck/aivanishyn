package homework_21;

import java.util.Random;

public class TestThreads {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        Account account = new Account();
        int cycle = 20;         // how many cycles we want for each thread ?
        int boundary = 100;     // max value for +/-

        Runnable task1 = () ->fill(account,cycle,boundary);
        Runnable task2 = () ->fill(account,cycle,boundary);

        System.out.println("Value in account before start: " + account.getCount());

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.setName("TH-1");
        thread2.setName("TH-2");

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Value in account after finish: " + account.getCount());
    }

    public static void fill(Account account, int cycle, int boundary){
        Random rand = new Random();
        for (int i = 0; i < cycle; i++) {
            if (rand.nextBoolean()) {
                account.replenishment(rand.nextInt(boundary));
            } else {
                account.withdrawal(rand.nextInt(boundary));
                Thread.yield();
            }
        }
    }

}
