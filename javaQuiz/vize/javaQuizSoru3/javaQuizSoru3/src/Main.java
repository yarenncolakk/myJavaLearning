/* kullanıcıdan alınan iki sayı ile hesaplamayı gerçekleşritin.
   sayı 3 9
   1!/3+2!/4+3!/5+4!/6+5!/7+6!/8+7!/9  */

import java.util.Scanner;

public class Main {
    public static int Faktoriyel(int sayi)
    {
        int faktoriyel = 1;
        for (int i=1; i<=sayi; i++)
        {
            faktoriyel = faktoriyel * i;
        }
        return faktoriyel;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        double sayi1,sayi2, toplam=0;

        System.out.println("İki Sayı Giriniz.");
        sayi1 = scr.nextDouble();
        sayi2 = scr.nextDouble();

        for(int i=1; sayi1<=sayi2; i++)
        {
            toplam = toplam + (Faktoriyel(i)/sayi1);
            System.out.print(i + "!" + "/" + sayi1 + "+");
            sayi1++;
        }
        System.out.println();
        System.out.println("hesap :"+toplam);

    }
}