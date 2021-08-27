package homework_4;

public class Task_6 {
    public static void main(String[] args) {
        int j=0;
        for (int i = 0; i>-100;i-=5){
            System.out.println((j+1) + " \t" + i);
            j++;
            if(j==10)
                break;
        }
    }
}
