package homework_4;


public class Task_8 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int counter = 0;
        for (int i = 0; i < 100; i++) {
            if (counter == 10)
                break;
            else if (i % 2 != 0) {
                arr[counter] = i;
                counter++;
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            if (i!=arr.length-1)
                System.out.print(", ");
        }

    }
}
