
public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;
        int tampon = num1;
        System.out.println("La valeur de num1 est " + num1 + " la valeur de num2 est " + num2);
        num1 = num2;
        num2 = tampon;
        System.out.println("La valeur de num1 est " + num1 + " la valeur de num2 est " + num2);
    }
}