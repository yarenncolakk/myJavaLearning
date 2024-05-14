import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("kod.txt");
        if(!file.exists()){
            file.createNewFile();
        } //kod adında bir dosya oluşturuldu.

        String val = "Kodlama Vakti";

        FileWriter fWritter = new FileWriter(file, false); //file ürettiğim obje. dosyanın okunabilir/yazılabilir olup olmadığını kontrol et.
        BufferedWriter bWritter = new BufferedWriter(fWritter); //işlem hızlandırma amacıyla kullanılır.
        bWritter.write(val);
        bWritter.write("\nJava Dersleri"); //yazdırmak istenilen değerler bWritter.write komutuyla yazdırılabilir.
        bWritter.close();
        //dosyaya val değerini yazdırmış olduk.

        FileReader fReader = new FileReader(file);
        String line; //okuma işlemi satır satır olur.
        BufferedReader bReader = new BufferedReader(fReader);

        while((line = bReader.readLine()) != null){ //satır satır okuma yapılır. satır boş olmadığı sürece bu işlem devam eder.
            System.out.println(line);
        }
        bReader.close();
        //terminale yazdırdık. yazdırma işlemi tamamlandı.

    }
}