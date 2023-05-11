public class Job12 {
    public static void main(String[] args) {
        int nb_rep = 0;
        int dice_1 = 1;
        int dice_2 = 1;
        int dice_3 = 1;
        
        while (dice_1 <= 6) {
            while (dice_2 <= 6) {
                while (dice_3 <= 6) {
                    System.out.println(dice_1 + ":" + dice_2 + ":" + dice_3);
                    dice_3 += 1;
                    nb_rep += 1;
                }
                dice_2 += 1;
                dice_3 = 1;
            }
            dice_1 += 1;
            dice_2 = 1;
        }
        System.out.println(nb_rep);
    }
}
