public class Main {
    public static void main(String[] args) {

    /* Arkadas Sayi: Kendileri haric pozitif bolenleri toplami birbirine esit olan sayilar.
       220-284
       1den 220ye kadar tum bolenleri toplami 284tür.
       1den 284e kadar tum bolenleri toplami 220dir.   */

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }

        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }

        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("Bu iki sayi arkadastir.");
        } else {
            System.out.println("Bu iki sayi arkadas degildir!");
        }


    }
}