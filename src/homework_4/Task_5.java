package homework_4;

import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        System.out.print("Enter the grade of number: ");
        int grade = scan.nextInt();
        int temp = number;

        if (grade == 0)
            System.out.println("0");
        else if (grade == 1) {
            System.out.println("The number always gonna be the number at 1st grade");
        } else {
            for (int i = 2; i <= grade; i++) {
                number = number * temp;
            }
            System.out.println(temp + " at grade " + grade + " is: " + number);
        }
    }
}
