package homework_3;

public class Some {
    public static void main(String[] args) {

        //System.out.println(isNumberExist("  +3806712-34 -567"));
        //System.out.println(sumEvenDigits(329827));
        System.out.println(sumEvenDigitsByDividingByTen(12234568));
    }
    public static boolean isNumberExist(String phoneNumber){
        String existingPhoneNumber = "380671234567";
        //return existingPhoneNumber.equals(phoneNumber.trim().replace("+",""));
        //return existingPhoneNumber.equals(phoneNumber.trim().replaceAll("^[0-9]",""));
        System.out.println(phoneNumber.trim().replaceAll("^[0-9]",""));
        return false;

    }

    static int sumEvenDigits(int number){
        int sum = 0;
        String strNum = String.valueOf(number);
        char [] digits = strNum.toCharArray();
        for(char c: digits){
            if(Integer.parseInt(String.valueOf(c)) % 2 ==0 )
                sum += Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }

    static int sumEvenDigitsByDividingByTen(int number){
        int lastDigit = -1;
        int sum = 0;
        while(number !=0){
            lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                sum += lastDigit;
            }
            number /= 10;
        }
        return sum;
    }
}
