package lesson_7;

public class lesson_7 {
    public static void main(String[] args) {

        testCalc();

    }

    static void testCalc() {
        String dataArray[] = {"3 - 1", "3 + 0", "6 * 2", "9 / 3", "78 * 4", "1 / 4"};
        double expectedRes[] = {2, 3, 12, 3, 312, 0.25d};
        double actualRes[] = new double[dataArray.length];

        for (int i = 0; i < dataArray.length; i++) {
            double temp;
            temp = calc(dataArray[i]);
            actualRes[i] = temp;
            //System.out.println(temp);
        }
        for (int i = 0; i < actualRes.length; i++) {
            if (actualRes[i] != expectedRes[i]) {
                System.out.println("Test  FAILED on index " + i);
                System.exit(0); // out of system for program not go further
                //throw new RuntimeException("Test  FAILED on index " + i); // another way to crash system)))
            } else {
                System.out.println("Expected res:" + expectedRes[i] + "\tActual res:" + actualRes[i]);
            }
        }
        System.out.println("Test Pass !!!");
    }

    public static double calc(String data) {

        String[] arr = data.split(" ");
        double res = 0;
        switch (arr[1]) {
            case "/":
                res = Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]);
                break;
            case "*":
                res = Double.parseDouble(arr[0]) * Double.parseDouble(arr[2]);
                break;
            case "-":
                res = Double.parseDouble(arr[0]) - Double.parseDouble(arr[2]);
                break;
            case "+":
                res = Double.parseDouble(arr[0]) + Double.parseDouble(arr[2]);
                break;
        }
        //System.out.println(res);
        return res;
    }
}
