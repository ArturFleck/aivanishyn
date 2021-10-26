package homework_21;

public class threads {
    public static void main(String[] args) throws InterruptedException{

    Account account = new Account();
    Thread putMoney = new Thread();
    Thread takeMoney = new Thread();

    putMoney.start();
    takeMoney.start();

    System.out.println(account.getCount());
    }
}
