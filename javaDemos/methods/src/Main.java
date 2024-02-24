public class Main {
    public static void main(String[] args) {

        int toplam = topla(2, 3, 4, 5, 6, 10);
        System.out.println(toplam);
    }

    //veriable arguments

    public static int topla(int... sayilar) { //birden fazla sayı tanımı için ... kullanılır. Buna veriable arguments denir.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }
}