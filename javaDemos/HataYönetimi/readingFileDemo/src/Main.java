import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException { //throw-->hata fırlatır.
        //dosyaları bellekte hızlıca okumak için önce dosyayı belleğe alan ve oradan okumamızı sağlayan class:
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\yaren\\OneDrive\\Masaüstü\\Software\\Java\\javaDemos\\HataYönetimi\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;
            while ((line = reader.readLine())!=null)
            {
                total += Integer.valueOf(line); //stringleri (herhangi bir hegeri) int yapmak için.
            }
            System.out.println("Toplam= " + total);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            reader.close();
            //throws IOException dosyayı bulamazsa kapatamaz.
            //kapatacak bir şey  olmadığını ioexceptionla aktarması gerekiyor. hata verebilir uyarısı.
            //throw istenmiyorsa finally blokunun içinde başka bir try-catch yazılır.
            /*try{
            reader.close();
            }
            catch(Exception exception){
            }
             */
        }

    }
}