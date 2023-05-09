import java.util.Scanner;

public class MinutesHeures {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.print("Entrez une durée en minutes : ");
        int time = keyb.nextInt();
        System.out.println(time + " minutes est equivalent a : " + time / 60 + " heures et " + time % 60 + " minutes");
        keyb.close();
    }
}
