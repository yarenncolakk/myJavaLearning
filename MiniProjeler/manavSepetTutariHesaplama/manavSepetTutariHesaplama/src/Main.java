import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican = 7.00;

        double toplam = 0.0;

        System.out.print("Salatalık Kaç Kilo: ");
        double salatalikKilo = scanner.nextDouble();
        toplam += salatalik * salatalikKilo;

        System.out.print("Elma Kaç Kilo: ");
        double elmaKilo = scanner.nextDouble();
        toplam += elma * elmaKilo;

        System.out.print("Kabak Kaç Kilo: ");
        double kabakKilo =  scanner.nextDouble();
        toplam += kabak * kabakKilo;

        System.out.print("Domates Kaç Kilo: ");
        double domatesKilo = scanner.nextDouble();
        toplam += domates * domatesKilo;

        System.out.print("Patlıcan Kaç Kilo: ");
        double patlicanKilo = scanner.nextDouble();
        toplam += patlican * patlicanKilo;

        System.out.println("Toplam Tutar: " + toplam + " TL");

    }
}