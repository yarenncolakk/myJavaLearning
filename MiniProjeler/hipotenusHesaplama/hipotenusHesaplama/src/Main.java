import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("İkinci Kenarı Giriniz: ");
        double kenar2 = scanner.nextDouble();

        double hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenüs: " + hipotenus);

        double cevre = kenar1 + kenar2 + hipotenus;
        System.out.println("Üçgenin Çevresi: " + cevre);

        double alan = (kenar1 * kenar2)/2;
        System.out.println("Üçgenin Alanı: " + alan);
    }
}