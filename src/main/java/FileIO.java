import java.io.*;

public class FileIO {

    public static void main(String[] args) {
        dataWrite();
        dataRead();
    }

    private static void dataRead() {
        try (BufferedReader okuyucu = new BufferedReader(new FileReader("score.txt"))) {
            String s;
            while ((s = okuyucu.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void dataWrite() {
        try (BufferedWriter yazici = new BufferedWriter(new FileWriter("score.txt", true))) {
            yazici.write("Hello");
          
            yazici.write("I am Emre");
            yazici.write("End of File");
    
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
