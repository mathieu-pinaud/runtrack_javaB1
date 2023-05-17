import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomstringThread {
    public static void file_handler(String name, String content) {
        try {
            FileWriter fw = new FileWriter(name);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyb = new Scanner(System.in);
        System.out.println("Donnez la longueure de la chaine voulue");
        int taille = keyb.nextInt();
        String char_string = "";
        long start_time = System.nanoTime();
        for (int i = 0; i < taille ; i += 1) {
            char_string += (char)(random.nextInt(26) + 'a');
        }
        file_handler("output.txt", char_string.substring(0, taille/2));
        MyThread thread = new MyThread();
        thread.run(char_string.substring(taille/2));
        long end_time = System.nanoTime();
        System.out.println("Temps d'execution en millisecondes: " + (end_time - start_time) / 1000000);
        keyb.close();
    }
}
