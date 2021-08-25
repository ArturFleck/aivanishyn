package homework_3;

public class Task_9 {
    public static void main(String[] args) {

        int arr[] = {0, 2, 3, 0, 5, 4, 0};
        Array(arr);

    }

    public static void Array(int array[]) {
        System.out.println("The array is:");
        for (int j : array) {
            System.out.print(j + " ");
        }

        int min = array[0];
        int indexTemp1 = 0;
        for (int k = 0; k < array.length; k++) {
            if (min > array[k]) {
                min = array[k];
                indexTemp1 = k;
            }
        }
        System.out.println("\n");
        for (int p = 0; p < array.length; p++) {
            if (p == indexTemp1 || array[p] == min) {
                System.out.print(min + " ");
            }
        }

        System.out.println("\n\nThe smallest number of array is: " + min);
    }
}