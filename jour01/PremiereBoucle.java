import java.util.Scanner;

public class PremiereBoucle {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int stop = keyb.nextInt();
        int i = 1;
        while (i <= stop) {
            System.out.print(i + ", ");
            i +=1;
        }
        keyb.close();
    }
}
