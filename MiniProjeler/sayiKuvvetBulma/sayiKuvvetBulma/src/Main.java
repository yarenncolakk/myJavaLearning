import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("N Değerini Giriniz: ");
        int n = scanner.nextInt();

        System.out.print("Sınır Değerini Giriniz: ");
        int sinir = scanner.nextInt();

        for(int i = 1; i <= sinir; i *= n){
            System.out.println(i);
        }





    }
}