import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Faktöriyel sayısı:");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;
        for(int i = 1; i <= sayi; i++){
            faktoriyel *= i;
        }
        System.out.println("Sonuç: " + faktoriyel);
    }
}