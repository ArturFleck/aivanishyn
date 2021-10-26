package homework_21;

import java.util.Random;

public class Account {
    Random rand = new Random();
    private int count = rand.nextInt(999);

    public void replenishment(int amount) {
        count += amount;
        System.out.println("putting " + amount);
    }

    public void withdrawal(int amount) {
        count -= amount;
        System.out.println("taking " + amount);
    }

    public int getCount() {
        return count;
    }

}
