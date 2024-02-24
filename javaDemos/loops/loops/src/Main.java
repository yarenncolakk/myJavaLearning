public class Main {
    public static void main(String[] args) {

        //For dongusu tek sayılar

        for (int i = 1; i <= 10; i += 2) {   //int i sadece bu blokta tanimli {}
            System.out.println(i);
        }

        System.out.println("Tek Sayilar");

        //For dongusu cift sayilar


        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("Cift Sayilar");

        //While dongusu

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;     //i++ olarak tanımlanmazsa sonsuz döngüye girer çünkü 1 her zaman 10dan küçüktür.
        }

        System.out.println("While Dongusu Bitti");

        //Do-While dongusu

        int j = 1;   //j=100 olarak tanımlandığında şartı sağlamasa bile 1 kere döngüye girer ve ekranda 100 yazar.
        do {
            System.out.println(j);
            j += 2;
        }
        while (j < 10);

        System.out.println("Do-While Dongusu Bitti");


    }
}
