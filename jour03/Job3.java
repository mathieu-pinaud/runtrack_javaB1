public class Job3 {
    public static void main(String[] args) {
        String[] tableau = {"Josette", "John", "Myrtille", "Marc"};
        System.out.println(tableau[1]);
        tableau[2] = "Mireille";
        for (String str: tableau) {
            System.out.println(str);            
        }
    }
    
}