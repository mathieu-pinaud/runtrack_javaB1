import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Randomstring {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyb = new Scanner(System.in);
        System.out.println("Donnez la longueure de la chaine voulue");
        int taille = keyb.nextInt();
        String char_string = "";
        long start_time = System.nanoTime();
        for (int i = 0; i < taille ; i += 1) {
            char_string += random.nextInt(26) + 'a';
        }
        file_handler("output.txt", char_string);
        long end_time = System.nanoTime();
        System.out.println("Temps d'execution en millisecondes: " + (end_time - start_time) / 1000000);
        keyb.close();
    }

    public static File file_handler(String name, String content) {
        File file = new File(name);
        try {         
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return(file);
    }
}
