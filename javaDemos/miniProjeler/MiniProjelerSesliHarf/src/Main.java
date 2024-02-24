public class Main {
    public static void main(String[] args) {

        char harf = 'e'; //Buradan değiştir dene.

        switch (harf) {

            case 'a':
            case 'ı':
            case 'o':
            case 'u':

                System.out.println("Kalın sesli harf.");
                break;

            default:
                System.out.println("İnce sesli harf.");
        }
    }
}