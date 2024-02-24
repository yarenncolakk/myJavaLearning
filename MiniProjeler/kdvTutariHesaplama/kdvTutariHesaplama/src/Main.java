import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınan fiyatın kdvli fiyatını ve kdv tutarını hesapla. kdv tutarı %18

        Scanner scanner = new Scanner(System.in);
        double tutar;

        System.out.print("Tutar Giriniz: ");
        tutar = scanner.nextDouble();

        System.out.println("KDV Oranı: %18");

        double kdvTutari = (tutar * 18)/100;
        System.out.println("KDV Tutarı: " + kdvTutari );

        double kdvSonuc = tutar + kdvTutari;
        System.out.println("KDV'li Tutar: " + kdvSonuc);




    }
}