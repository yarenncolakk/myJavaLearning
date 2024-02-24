import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Gününüzü Giriniz: ");
        int day = scanner.nextInt();
        System.out.print("Doğum Ayınızı Sayı Olarak Giriniz: ");
        int mounth = scanner.nextInt();

        if(mounth == 12){
            if(day <= 21 ){
                System.out.println("Burcunuz: Yay");
            }else{
                System.out.println("Burcunuz: Oğlak");
            }
        }
        else if(mounth == 1){
            if(day <= 21){
                System.out.println("Burcunuz: Oğlak");
            }else{
                System.out.println("Burcunuz: Kova");
            }
        }
        else if(mounth == 2){
            if(day <= 19){
                System.out.println("Burcunuz: Kova");
            }else{
                System.out.println("Burcunuz: Balık");
            }
        }
        else if(mounth == 3){
            if(day <= 20){
                System.out.println("Burcunuz: Balık");
            }else{
                System.out.println("Burcunuz: Koç");
            }
        }
        else if(mounth == 4){
            if(day <= 21){
                System.out.println("Burcunuz: Koç");
            }else{
                System.out.println("Burcunuz: Boğa");
            }
        }
        else if(mounth == 5){
            if(day <=21){
                System.out.println("Burcunuz: Boğa");
            }else{
                System.out.println("Burcunuz: İkizler");
            }
        }
        else if(mounth == 6){
            if(day <= 21){
                System.out.println("Burcunuz: İkizler");
            }else{
                System.out.println("Burcunuz: Yengeç");
            }
        }
        else if(mounth == 7){
            if(day <= 22){
                System.out.println("Burcunuz: Yengeç");
            }else{
                System.out.println("Burcunuz: Aslan");
            }
        }
        else if(mounth == 8){
            if(day <= 23){
                System.out.println("Burcunuz: Aslan");
            }else{
                System.out.println("Burcunuz: Başak");
            }
        }
        else if(mounth == 9){
            if(day <= 24){
                System.out.println("Burcunuz: Başak");
            }else{
                System.out.println("Burcunuz: Terazi");
            }
        }
        else if(mounth == 10){
            if(day <= 24){
                System.out.println("Burcunuz: Terazi");
            }else{
                System.out.println("Burcunuz: Akrep");
            }
        }
        else if(mounth == 11){
            if(day <= 24){
                System.out.println("Burcunuz: Akrep");
            }else{
                System.out.println("Burcunuz: Yay");
            }
        }
        else{
            System.out.println("Hatalı Tarih Girdiniz.");
        }

    }
}