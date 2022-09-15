package tasks;

public class task6 {
    public static void main(String[] args) {
        float n = 1;
        for (int i=1;i<11;i++){
            System.out.println("H" +i+": "+n);
            n += 1.0/(i+1);
        }
    }
}
