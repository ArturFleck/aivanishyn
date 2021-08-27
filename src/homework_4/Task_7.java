package homework_4;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numb = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numb + " = " + (i * numb));
        }
    }
}
