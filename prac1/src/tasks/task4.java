package tasks;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        System.out.println("Enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[10];
        int sum = 0;
        int min = 2147483647;
        int max = -2147483648;
        int i =0;
        while (i<10){
            mas[i] = sc.nextInt();
            sum+=mas[i];
            if (mas[i]>max){
                max = mas[i];
            }
            if (mas[i]<min){
                min = mas[i];
            }
            i++;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
    }
}
