public class Main {
    public static void main(String[] args) {

        int number = 23;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;    //asal mı? evet kabul edelim.

        if (number == 1) {
            System.out.println("Sayi asal degildir.");
            return;  //eğer kod bu bloka girerse bu blokta kod biter. devamına bakmaz.
        }

        if (number < 1) {
            System.out.println("Geçersiz sayi");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {   //(isPrime == true) ile aynı anlama gelir.
            System.out.println("Sayi asaldir.");
        } else {
            System.out.println("Sayi asal degildir.");
        }

    }
}