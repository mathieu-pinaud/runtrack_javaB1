import java.util.Scanner;

public class SwapString {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Rentrez un premier mot");
        String chaine1 = keyb.nextLine();
        System.out.println("Rentrez un deuxieme mot");
        String chaine2 = keyb.nextLine();
        chaine1 += chaine2;
        chaine2 = chaine1.substring(0, chaine1.length() - chaine2.length());
        chaine1 = chaine1.substring(chaine2.length());
        System.out.println(chaine1 + ' ' + chaine2);
        keyb.close();
    }
}
