import java.util.Scanner;

public class Job3 {
    public static void main(String[] args) {
        System.out.println("donnez un chiffre");
        Scanner keyb = new Scanner(System.in);
        int base = keyb.nextInt();
        for (int i = 1; i <= 10; i+=1) {
            System.out.println(i + " x " + base + " = " + base * i);
        }
        keyb.close();
    }
}
