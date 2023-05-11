import java.util.Scanner;

public class Job11 {
    public static void main(String[] args) {
        Scanner keybScanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre ");
        int length = keybScanner.nextInt();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        keybScanner.close();
    }
}
