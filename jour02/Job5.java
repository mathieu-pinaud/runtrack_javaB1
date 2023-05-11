import java.util.Scanner;;

public class Job5 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Rentrez votre age");
        int age = keyb.nextInt();
        if (age < 16)
            System.out.println("Vous etes trop jeune pour travailler");
        else if (age > 67)
            System.out.println("vous etes à la retraite");
        else if (age > 55)
            System.out.println("vous allez avoir du mal a trouver un travail");
        else
            System.out.println("bon courrage");
        keyb.close();
    }
}
