package homework_7;
import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада в банк в гривнах: ");
        double sum = sc.nextDouble();
        System.out.print("Какой процент годовых? ");
        double percent = sc.nextDouble();
        System.out.print("Длительность вклада (лет): ");
        int term = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            if (i == 1) {
                System.out.println("Накопленная сумма за " + i + " год составила: " + String.format("%.2f",sum).replace(",",".") + " грн");
            } else if (i > 1 && i <= 4) {
                System.out.println("Накопленная сумма за " + i + " года составила: " + String.format("%.2f",sum).replace(",",".")+ " грн");
            } else {
                System.out.println("Накопленная сумма за " + i + " лет составила: " + String.format("%.2f",sum).replace(",",".")+ " грн");
            }
            System.out.println("Начисленные проценты в грн: " + String.format("%.2f",y).replace(",","."));
            System.out.println("----------------------------------");
        }
    }
}
