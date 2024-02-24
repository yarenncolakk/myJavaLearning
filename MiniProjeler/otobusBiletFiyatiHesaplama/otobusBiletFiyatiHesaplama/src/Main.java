import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km;
        int yas, yolculukTipi;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi KM Türünden Giriniz: ");
        km = scanner.nextDouble();

        System.out.print("Yaşınızı Giriniz:");
        yas = scanner.nextInt();

        System.out.print("Yolculuk Tipinizi Giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş): ");
        yolculukTipi = scanner.nextInt();

        if(km > 0 && yas > 0 && yolculukTipi == 1 || yolculukTipi == 2){
            double ucret = km * 0.10;

            double indirim = 0;
            if(yas < 12){
                indirim = (ucret * 50)/100;
            }
            else if(yas >= 12 && yas <= 24){
                indirim = (ucret * 10)/100;
            }
            else if(yas > 65){
                indirim = (ucret * 30)/100;
            }
            ucret -= indirim;

            if(yolculukTipi == 2){
                indirim = (ucret * 0.20);
                ucret -= indirim;
                ucret *= 2;
            }
            System.out.println("Bilet Ücreti: " + ucret + " TL");
        }
        else{
            System.out.println("Hatalı Veri Girdiniz!");
        }

    }
}