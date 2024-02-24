import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu Metre Cinsinde Giriniz: ");
        double boy = scanner.nextDouble();

        System.out.print("Lütfen Kilonuzu Giriniz: ");
        double kilo = scanner.nextDouble();

        double indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);

        if(indeks < 18.5){
            System.out.println("Zayıf");
        }
        else if(indeks > 18.5 && indeks < 24.9){
            System.out.println("İdeal");
        }
        else if(indeks > 25 && indeks < 29.9){
            System.out.println("Şişman");
        }
        else if(indeks > 30 && indeks < 34.9){
            System.out.println("Obez");
        }
        else if(indeks > 35){
            System.out.println("Aşırı Obez");
        }




    }
}