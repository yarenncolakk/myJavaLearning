import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double taksimetre = 10.0;
        double kmUcret = 2.20;
        double km;

        Scanner scanner = new Scanner(System.in);

        System.out.print("KM Verisini Giriniz: ");
        km = scanner.nextDouble();
        taksimetre += km * kmUcret;

        if(taksimetre < 20.0) {
            taksimetre = 20;
            System.out.println("Taksimetre: " + taksimetre);
        }
        else{
            System.out.println("Taksimetre: " + taksimetre);
        }











    }
}