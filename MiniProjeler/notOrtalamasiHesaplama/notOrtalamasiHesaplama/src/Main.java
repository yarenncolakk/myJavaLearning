import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int fizik,matematik,turkce,kimya,muzik,tarih;

        System.out.print("Fizik Notunuz: ");
        fizik = scanner.nextInt();

        System.out.print("Matematik Notunuz: ");
        matematik = scanner.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce = scanner.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = scanner.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = scanner.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = scanner.nextInt();

        double ortalama = (fizik + matematik + turkce + kimya + muzik + tarih)/6.0;
        System.out.println("Ortalamanız: " + ortalama);



    }
}