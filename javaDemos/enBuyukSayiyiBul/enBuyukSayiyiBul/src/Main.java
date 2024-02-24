public class Main {
    public static void main(String[] args) {

        int sayi1 = 24;
        int sayi2 = 32;
        int sayi3 = 13;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3){
            enBuyuk =sayi3;
        }

        System.out.println("En Buyuk Sayi: " +enBuyuk);
    }
}