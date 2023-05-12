import java.util.Arrays;

public class Job8 {
    public static void main(String[] args) {
        int[][] tableau = {{5, 9 , 3}, {7, 2, 8}, {1, 6, 4}};
        int nb_ligne = tableau.length;
        int nb_colonne = tableau[0].length;
        int[] tableau_reduit = new int[nb_colonne * nb_ligne];
        int tableau_reduit_index = 0;


        for (int i = 0; i < nb_ligne; i++) {
            for (int j = 0; j < nb_colonne; j++) {
                tableau_reduit[tableau_reduit_index] = tableau[i][j];
                tableau_reduit_index += 1;
            }            
        }
        Arrays.sort(tableau_reduit);
        tableau_reduit_index = 0;
        for (int i = 0; i < nb_ligne; i++) {
            for (int j = 0; j < nb_colonne; j++) {
                tableau[i][j] = tableau_reduit[tableau_reduit_index];
                tableau_reduit_index += 1;
            }

        }
        for (int[] ligne : tableau) {
            for (int i = 0; i < 3; i+= 1) {
                System.out.print(ligne[i] + " ");
            }
            System.out.println();
        }
    }
}
