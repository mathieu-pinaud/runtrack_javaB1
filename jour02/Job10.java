public class Job10 {
    public static void main(String[] args) {
        int nb = 1234;
        int res = 0;
        int first;
        while (nb >= 1) {
            first = nb % 10;
            res += first;
            nb = (nb - first) / 10;
        }
        System.out.println("La somme des chiffres de 1234 est : " + res);
    }
}
    
