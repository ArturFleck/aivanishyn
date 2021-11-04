package homework_21_2;

import java.util.Objects;

public class Account {

    public boolean fl1 = false; // flag of ending first thread
    public boolean fl2 = false; // flag of ending second thread
    public boolean flag1, flag2;    // flags of waiting

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

            while (amount > count) {    // waiting while balance will be more than amount of withdrawal, rewritten piece of code block
                try {
                    if (Objects.equals(Thread.currentThread().getName(), "TH-1")) {
                        flag1 = true;
                    }
                    if (Objects.equals(Thread.currentThread().getName(), "TH-2")) {
                        flag2 = true;
                    }
                    wait();
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount + "   TAKE IT...");
            count -= amount;
            if (Objects.equals(Thread.currentThread().getName(), "TH-1")) {
                flag1 = false;
            }
            if (Objects.equals(Thread.currentThread().getName(), "TH-2")) {
                flag2 = false;
            }
        }
/*          // SCRATCH for upper piece of code block, don't know if i'm gonna use it

        if (Objects.equals(Thread.currentThread().getName(), "TH-1")) {
            while (amount > count) {    // waiting while balance will be more than amount of withdrawal
                try {
                    flag1 = true;
                    wait();
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
            count -= amount;
            flag1 = false;
        }

        if (Objects.equals(Thread.currentThread().getName(), "TH-2")) {
            while (amount > count) {    // waiting while balance will be more than amount of withdrawal
                try {
                    flag2 = true;
                    wait();
                } catch (InterruptedException ignored) {
                }
            }
            System.out.println("Balance:" + getCount() + "  " + Thread.currentThread().getName() + " (-): " + amount);
            count -= amount;
            flag2 = false;
        }
    }*/

}

    public synchronized int getCount() {
        return count;
    }
}
