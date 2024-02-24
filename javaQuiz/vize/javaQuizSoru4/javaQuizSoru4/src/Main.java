import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] dizi1 = new int[3];
        int[] dizi2 = new int[3];
        int[] dizi3 = new int[3];
        int[][] dizi4 = new int[3][3];

        Scanner scr = new Scanner(System.in);
        System.out.print("Lütfen, birinci dizinin üç elemanını giriniz:");
        for (int i = 0; i < dizi1.length; i++) {
            dizi1[i] = scr.nextInt();
        }
        System.out.println("1.dizi oluşturuldu.");

        System.out.print("Lütfen, ikinci dizinin üç elemanını giriniz.");
        for (int i = 0; i < dizi2.length; i++) {
            dizi2[i] = scr.nextInt();
        }
        System.out.println("2.dizi oluşturuldu.");

        System.out.print("Lütfen, üçüncü dizinin üç elemanını giriniz.");
        for (int i = 0; i < dizi3.length; i++) {
            dizi3[i] = scr.nextInt();
        }
        System.out.println("3.dizi oluşturuldu.");

        for(int i=0; i<dizi1.length; i++)
        {
            dizi4 [0][i] = dizi1[i];
            dizi4 [1][i] = dizi2[i];
            dizi4 [2][i] = dizi3[i];
        }
        System.out.println("3x3'lük yeni bir matris oluşturuldu.");
        for(int i=0; i<dizi4.length; i++)
        {
            for(int j=0; j<dizi4.length; j++)
            {
                System.out.print(dizi4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrisin değişen sonuçları");
        dizi4[0][2] = (int) Math.pow(dizi4[0][2],2);
        dizi4[1][1] = (int) Math.pow(dizi4[1][1],2);
        dizi4[2][2] = (int) Math.pow(dizi4[2][2],2);

        for(int i=0; i<dizi4.length; i++)
        {
            for(int j=0; j<dizi4.length; j++)
            {
                System.out.print(dizi4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Yeni bir matris oluşturuldu.");
    }
}
