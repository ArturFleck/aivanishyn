package homework_21;

public class Account {
    private int count = 0;

    public void replenishment(int amount) {
        count += amount;
    }

    public void withdrawal(int amount) {
        count -= amount;
    }

    public int getCount() {
        return count;
    }

}
