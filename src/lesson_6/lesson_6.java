package lesson_6;

import java.util.Scanner;

public class lesson_6 {
    public static void main(String[] args) {

        int a=5;
        int b=3;
        double c= Math.pow(a,b);
        //System.out.println(String.format("Число %s в тепени %s равно %s"+ a,b,Math.pow(a;b);
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String []arr =str.split(" ");
        double res = 0;
        switch (arr[1]){
            case "/":
                res = Double.parseDouble(arr[0])/Double.parseDouble(arr[2]);
                break;
            case "*":
                res = Double.parseDouble(arr[0])*Double.parseDouble(arr[2]);
                break;
            case "-":
                res = Double.parseDouble(arr[0])-Double.parseDouble(arr[2]);
                break;
            case "+":
                res = Double.parseDouble(arr[0])+Double.parseDouble(arr[2]);
                break;
          }
        System.out.println(res);
    }
}
