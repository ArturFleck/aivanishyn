package homework_3;

public class Task_13 {
    public static void main(String[] args) {

        int n = 8;
        int m = 8;

        String[][] array = new String[n][m];    // creating String Array but we can do output without it, just straight out in console

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((j % 2 == 0 && i % 2 == 0) || (j % 2 != 0 && i % 2 != 0)) {
                    //System.out.print("W "); // uncomment for printing direct in console
                    array[i][j] = "W";
                }
                if ((j % 2 != 0 && i % 2 == 0) || (j % 2 == 0 && i % 2 != 0)) {
                    //System.out.print("B "); // uncomment for printing direct in console
                    array[i][j] = "B";
                }
            }
            //System.out.println(); // uncomment for printing direct in console
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
