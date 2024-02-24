import java.util.HashMap;
//ing-turk sozluk:
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>(); //ilk string key, ikinci string value
        //int int, string int, herhangi bir class nesne vs vs de olabilir...

        sozluk.put("book","kitap"); //yeni bir eleman eklemek için -->put
        sozluk.put("table","masa"); //yazıldığı sırayla gelmez karışık gelir.
        sozluk.put("computer","bilgisayar");

        System.out.println(sozluk.size());

        for (String item : sozluk.keySet())
        {
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        sozluk.remove("table");
        sozluk.clear();

        System.out.println(sozluk);
        System.out.println(sozluk.get("table")); //yukarıda sildik. null oldu. null: tuttuğu bir referans yok.


    }
}