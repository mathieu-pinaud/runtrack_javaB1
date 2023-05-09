public class Facture {
    public static void main(String[] args) {
        float prix = 49.99f;
        int quantite = 3;
        float tarifHT = quantite * prix;
        float tva = tarifHT / 5;
        float tarifTTC = tarifHT + tva;
        System.out.println("Le montant total est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + tva);
        System.out.println("Le montant total à payeer est : " + tarifTTC);
    }
}
