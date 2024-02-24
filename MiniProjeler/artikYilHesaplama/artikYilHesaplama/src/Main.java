import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Artık yıldır.");
        }
        else {
            System.out.println( year + " Artık yıl değildir.");
        }
    }
}
