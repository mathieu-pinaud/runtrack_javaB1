import java.util.Scanner;

public class Job8 {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Donnez un chiffre");
        double nb = keyb.nextDouble();
        int res = 0;
        if (nb < 0)
            nb *= -1;
        while (nb >= 1){
            res += 1;
            nb /= 10;        }
        System.out.println(res);
        keyb.close();
    }
}
