public class Main {
    public static void main(String[] args) {

        //diziler sayıların toplamı
        double myList[] = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0]; //en buyuk sayıyı da bulalım.

        for (double number : myList) {

            if (max < number) {
                max = number;
            }

            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam= " + total);
        System.out.println("En Buyuk Sayi= " + max);
    }
}