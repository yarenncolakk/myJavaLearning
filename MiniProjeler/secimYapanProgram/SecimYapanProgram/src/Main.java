import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcının girdiği değerlerden random değer seç ekrana bas.
        System.out.println("Benim İçin Seç Programımıza Hoş Geldiniz!");

        System.out.print("Kaç Tane Değer Gireceğinizi Yazınız: ");
        Scanner scanner = new Scanner(System.in);
        int tane = scanner.nextInt();

        System.out.println("Lütfen Seçim Yapmamızı İstediğiniz Değerleri Giriniz: ");
        String[] deger = new String[tane];
        for (int i = 0; i < deger.length; i++){
            deger[i] = scanner.next();
        }
        Random rnd = new Random();
        String[] dizi = new String[tane]; //yeni
        for (int i = 0; i < deger.length; i++){
            dizi[i] = deger [i];
           // System.out.println(dizi[i]);  kontrol için.
        }
        System.out.println();
        System.out.println("Sizin İçin Seçimimiz: " + dizi[rnd.nextInt(tane)] + "!");
    }
}