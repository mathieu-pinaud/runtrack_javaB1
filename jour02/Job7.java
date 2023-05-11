import java.util.*;

public class Job7 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Donnez un chiffre");
        int x = keyb.nextInt();
        int y = 1;
        System.out.print("la factorielle de " + x + " est : ");
        while (x >= 1) {
            y *= x;  
            x -= 1;
        }
        System.out.println(y);
        keyb.close();
    }
}
