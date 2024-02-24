import java.util.Scanner;
//kullanıcı negatif girene kadarki tek sayıların toplamı
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int total = 0;

        do {
            System.out.print("Sayı Giriniz: ");
            number = scanner.nextInt();

            if(number % 2 == 1){
                total += number;
            }
        }
        while (number > 0);
            System.out.println("Toplam: " + total);
        }
    }
