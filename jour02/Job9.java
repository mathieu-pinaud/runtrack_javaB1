public class Job9 {
    public static void main(String[] args) {
        int nb = 1234;
        int last = nb % 10;
        int first = nb % 10;
        while (nb >= 1) {
            first = nb % 10;
            nb = (nb - first) / 10;
        }
        System.out.println("Le premier chiffre de 1234 est : " + first);
        System.out.println("Le dernier chiffre de 1234 est : " + last);
    }
}
