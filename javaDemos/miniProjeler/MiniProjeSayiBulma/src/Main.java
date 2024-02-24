public class Main {
    public static void main(String[] args) {

        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 2;
        boolean varMi = false;

        for (int sayi : sayilar) // sayi degiskeni sayilari tek tek baksin.
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        if (varMi) {  //true ise
            System.out.println("Sayi mevcuttur: " +aranacak);
        } else {
            System.out.println("Sayi mevcut degildir: " +aranacak);
        }
    }
}