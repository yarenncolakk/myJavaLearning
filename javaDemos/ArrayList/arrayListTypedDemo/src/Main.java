import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//type-safe

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>(); //arrayListin tipini belirler <> içine yaz.
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");

        sehirler.remove("İstanbul");  //index sayısı ya da adı ile silme işlemi yapılabilir.
        Collections.sort(sehirler); //şehirleri sırala
        for(String sehir : sehirler)
        {
            System.out.println(sehir); //ankara aydın izmir oldu çünkü döngüye girmeden önce şehirleri sıraladık (sort)
        }
    }
}