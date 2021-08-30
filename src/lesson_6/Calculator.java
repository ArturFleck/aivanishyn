package lesson_6;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        calculate(str);


    }

    static double calculate(String str) {
        String[] words = str.split(" ");
        double res = 0;
        double a=0;
        double b=0;
        for (String word : words) {
            a = Double.parseDouble(words[0]);
            b = Double.parseDouble(words[2]);
            System.out.println(word);
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(words[1]);
        String st = "/";
        System.out.println();
        if (words[1].equals(st) ) {
            System.out.println(a);
            System.out.println(b);
            res = a / b;
            System.out.println(res);
        }


        return res;
    }

}
