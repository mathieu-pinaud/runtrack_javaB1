public class Job2 {
    public static void main(String[] args) {
        int[] montableau = {12, 6, 76, 89};
        for (int i : montableau) {
            System.out.println(i);
        }
        montableau[0] = 7;
        montableau[3] = 420;
        for (int i : montableau) {
            System.out.println(i);
        }
    }
}
