import java.io.FileWriter;
import java.io.IOException;

public class MyThread extends Thread{
    public static void file_handler(String name, String content) {
        try {
            FileWriter fw = new FileWriter(name, true);
            fw.write(content);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void run(String my_string) {
        file_handler("output.txt", my_string);
    }
}
