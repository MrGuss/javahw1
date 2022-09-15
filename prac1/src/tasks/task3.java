package tasks;

public class task3 {
    public static void main(String[] args) {
        int mas[] = {1,2,3,4,5,6,7,8,9,0};
        int sum = 0;
        for (int i : mas){
            sum+=i;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+(float)sum/mas.length);
    }
}
