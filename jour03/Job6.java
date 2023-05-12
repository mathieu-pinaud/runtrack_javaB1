import java.util.Random;

public class Job6 {
    public static void main(String[] args) {
        int[] tableau = new int[10];
        Random random = new Random();
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] =  random.nextInt();
            System.out.println(tableau[i]);
        }
    }
}
