import java.util.Scanner;

public class NomPrenom {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Donnez vottre preenom :");
        String prenom = keyb.nextLine();
        System.out.println("Donnez votre nom : ");
        String nom = keyb.nextLine();
        String res = prenom + ' ' + nom;
        System.out.println(res);
        keyb.close();
    }
}
