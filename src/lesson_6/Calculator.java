package lesson_6;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(calculate(str));
    }

    static double calculate(String str) {
        String[] words = str.split(" ");
        double res = 0;

        if (words[1].equals("/") ) {
            res = Double.parseDouble(words[0])/ Double.parseDouble(words[2]);
        }
        return res;
    }

}
