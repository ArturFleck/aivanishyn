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

                System.out.println("Накопленная сумма за " + i + termName(i) +  " составила: " + format(sum) + " грн");

            System.out.println("Начисленные проценты в грн: " + format(y));
            System.out.println("----------------------------------");
        }
    }

    public static String format(double number){
        String form=String.format("%.2f",number).replace(",",".");
        return form;
    }

    public static String termName(int term){
        int ageLastNumber = term % 10;
        boolean isExclusion = (term % 100 >= 11) && (term % 100 <= 14);
        String years = "";

        if (ageLastNumber == 1)
            years = " год";
        else if(ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
            years = " лет";
        else if(ageLastNumber >= 2 && ageLastNumber <= 4)
            years = " года";
        if (isExclusion)
            years = " лет";

        return years;
    }

}
