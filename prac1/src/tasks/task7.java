package tasks;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("!"+n+" = "+ fact(n));
    }

    public static long fact(int n){
        if (n<=1){
            return 1;
        }
        else{
            long fact = 1;
            for (int i=2;i<=n;i++){
                fact *= i;
            }
            return fact;
        }
    }
}
