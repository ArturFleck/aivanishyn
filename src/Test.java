public class Test {

    public static void main(String[] args) {

        long start = 0L;
        long end = 0L;

        start = System.currentTimeMillis();
        int x = 1;
        int[] arr = new int[20_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1_000_000 + (int) (Math.random() * 1_000_000);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();

        for (int k : arr) {
            sumEvenDigits(arr[k]);
        }
        end = System.currentTimeMillis();
        System.out.println("First " +(end - start));

        start = System.currentTimeMillis();
        for (int k : arr) {
            sumEvenDigitsByDividingByTen(arr[k]);
        }
        end = System.currentTimeMillis();
        System.out.println("Second " +(end - start));


    }

    static int sumEvenDigits ( int number){
        int sum = 0;
        String strNum = String.valueOf(number);
        char[] digits = strNum.toCharArray();
        for (char c : digits) {
            if (Integer.parseInt(String.valueOf(c)) % 2 == 0)
                sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    static int sumEvenDigitsByDividingByTen(int number) {
        int lastDigit = -1;
        int sum = 0;
        while (number != 0) {
            lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }

}





