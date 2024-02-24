import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz: ");
        double sayi1 = scanner.nextDouble();
        System.out.print("2.Sayıyı Giriniz: ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Lütfen yapmak istediğiniz işlemi (+,-,x,/) giriniz");
        String islem = scanner.next();

        switch (islem){
            case "+":
                System.out.println("Sonuç: " + (sayi1+sayi2));
                break;

            case "-":
                System.out.println("Sonuç: " + (sayi1-sayi2));
                break;

            case "x":
                System.out.println("Sonuç: " + (sayi1*sayi2));
                break;

            case "/":
                System.out.println("Sonuç: " + (sayi1 / sayi2));
                break;
        }

    }
}