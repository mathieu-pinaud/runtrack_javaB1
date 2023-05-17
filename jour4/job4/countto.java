import java.util.Scanner;

public class countto {
    public static void main(String[] args) {
        Scanner kScanner = new Scanner(System.in);
        System.out.println("Donnez un chiffre");
        int stop = kScanner.nextInt();
        long start_time = System.nanoTime();
        for (int i = 1; i <= stop; i += 1);
        long end_time = System.nanoTime();
        System.out.println("Temps d'execution en millisecondes: " + (end_time - start_time) / 1000000);
        kScanner.close();
    }
}
