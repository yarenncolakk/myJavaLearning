public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel.";

        System.out.println(mesaj);

        System.out.println("Eleman sayisi: " + mesaj.length());
        //.length() uzunluğunu hesaplar.


        System.out.println("5. eleman: " + mesaj.charAt(4));
        //.charAt n.elemanı hesaplar (5. eleman = 4.indis)


        System.out.println(mesaj.concat(" Yaşasın!"));
        //.concat() parantez içine yazılanı değişkenle birleştirir.


        System.out.println(mesaj.startsWith("B"));
        //.startsWith booleandır. Parantez içine yazılan ile başlıyor mu.


        System.out.println(mesaj.endsWith("."));
        //.endsWith booleandır. Parantez içine yazılan ile bitiyor mu.


        char[] karakterler = new char[5];

        mesaj.getChars(0, 5, karakterler, 0);
        //0dan 5e kadar karakterleri al. 0.indisten itibaren.


        System.out.println(karakterler);

        System.out.println(mesaj.indexOf('a'));
        //belirttiğim karakterin mesajın içinde kaçıncı eleman olduğunu bulur. 0. indisten saymaya başla.
        // "" ile string ifadeler de bulunabilir = "av"

        System.out.println(mesaj.lastIndexOf("e"));
        //baştan index numarasını verir (18) ama arama yapmaya sondan başlar.

        System.out.println(mesaj.lastIndexOf("a"));
        // cevap 9 çünkü aramaya sağdan başladığı için hava kelimesinin sonundaki a yı ilk gördü.


        System.out.println(mesaj.replace(' ', '-'));
        //değiştirme metodu.

        System.out.println(mesaj);
        //mesaj datada yeni bir değişkene atanmadan değişmez. aynı kalır.

        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2, 5));
        //metnin içinden seçilen yeri almak. 2.indexten itibaren. (2,5) olsaydı 2den 4e kadar alırdı.


        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        //boşluğa göre ayır " " içi boşluk olduğu için.
        // döngüyle kullanılır. çünkü boşluktan itibaren her bir kelimeyi ayırmasını istedim.


        System.out.println(mesaj.toLowerCase());
        //mesajı küçük harflere çevirir.

        System.out.println(mesaj.toUpperCase());
        //mesajı büyük harflere çevirir.

        /* System.out.println(mesaj.trim());
        mesajın başında-sonunda olan boşlukları götürür
        */


    }
}