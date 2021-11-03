package homework_21_2;

public class Account {

    public boolean flag1, flag2;
    boolean fl1 = false;
    boolean fl2 = false;
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
            if (Thread.currentThread().getName() == "TH-1") {
                while (amount > count) {
                    try {
                        flag1 = true;
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
                count -= amount;
                flag1 = false;
            }
            if (Thread.currentThread().getName() == "TH-2") {
                while (amount > count) {
                    try {
                        flag2 = true;
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
                count -= amount;
                flag2 = false;
            }
        }
    }

    public synchronized int getCount() {
        return count;
    }

}
