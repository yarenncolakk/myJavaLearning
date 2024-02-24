import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createFile();
        //getFileInfo();
        readFile(); //eski halini  yazsın
        writeFile();
        readFile(); //yeni halini de yazsın
    }

        public static void createFile(){
            File file = new File("C:\\Users\\yaren\\OneDrive\\Masaüstü\\Software\\Java\\javaDemos\\workingWithFiles\\files\\students.txt");
            try {
                if(file.createNewFile()) {
                    System.out.println("Dosya Oluşturuldu");
                }
                else{
                    System.out.println("Dosya Zaten Mevcut!");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void getFileInfo(){
            File file = new File("C:\\Users\\yaren\\OneDrive\\Masaüstü\\Software\\Java\\javaDemos\\workingWithFiles\\files\\students.txt");
            if(file.exists()){
                System.out.println("Dosya Adı: " + file.getName());
                System.out.println("Dosya Yolu: " + file.getAbsolutePath());
                System.out.println("Dosya yazılabilir mi: " + file.canWrite());
                System.out.println("Dosya okunabilir mi: " + file.canRead());
                System.out.println("Dosya boyutu (Byte) : " + file.length());
            }
        }

        public static void readFile(){
            File file = new File("C:\\Users\\yaren\\OneDrive\\Masaüstü\\Software\\Java\\javaDemos\\workingWithFiles\\files\\students.txt");
            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()){
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                reader.close();
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static void writeFile(){
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\yaren\\OneDrive\\Masaüstü\\Software\\Java\\javaDemos\\workingWithFiles\\files\\students.txt" ,true));
                //true ekleyerek dosyaya ekledik. true olmasaydı sadece yaren yazacaktı.
                writer.newLine(); //bu olmazsa yeni elemanı sondaki elemana bitişik olrak ekler.
                writer.write("Yaren");
                System.out.println("Dosyaya yazıldı.");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
}