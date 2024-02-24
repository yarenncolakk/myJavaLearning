public class Main {
    public static void main(String[] args) {

        //Mukemmel Sayi: Kendinden baska pozitif tam bolenlerinin sayisi toplami kendisine esit olan sayilardir.
        //6 --> 1+3+2=6 mukemmel sayi.

        int number = 28;  //mukemmel mi diye bakalım...
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }

        if (total == number) {
            System.out.println("Mukemmel Sayidir.");
        } else {
            System.out.println("Mukemmel Sayi Degildir.");
        }

    }
}