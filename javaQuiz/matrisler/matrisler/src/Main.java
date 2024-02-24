import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //transpoz();
        //carpim();
        //kare();
        //dongu();

    }
    public static void transpoz(){
        int[] matris1 = {1,2};
        int[] matris2 = {3,5};
        int[] matrisToplam = new int [2];
        int[] matrisCikar = new int [2];

        System.out.println("Matris1: [" + matris1[0] + " " + matris1[1] + "]");
        System.out.println("Matris2: [" + matris2[0] + " " + matris2[1] + "]");

        System.out.println();
        System.out.println("Matris 1 Transpoz");
        for (int i = 0; i < matris1.length; i++){
            System.out.println(matris1[i]);
        }

        System.out.println("Matris2 Transpoz:");
        for (int i = 0; i < matris2.length; i++){
            System.out.println(matris2[i]);
        }

        System.out.println("Matrislerin Toplamı:");
        for (int i = 0; i < matrisToplam.length; i++){
            matrisToplam[i] = matris1[i] + matris2[i];
            System.out.println(matrisToplam[i]);
        }

        System.out.println("Matrislerin Çıkarımı");
        for (int i = 0; i < matrisCikar.length; i++){
            matrisCikar[i] = matris1[i] - matris2[i];
            System.out.println(matrisCikar[i]);
        }
    }
    public static void carpim(){
        int[] dizi1 = new int[3];
        int[] dizi2 = new int[3];
        int[] secim = {1,5,4,3,7};
        int[][] yeniDizi = new int[3][3];

        Random rnd = new Random();
        for (int i = 0; i < dizi1.length; i++){
            dizi1[i] = secim[rnd.nextInt(secim.length)];   //dizi1 ve 2 random olarak secim dizisinden seçildi.
            dizi2[i] = secim[rnd.nextInt(secim.length)];
        }
        System.out.println("1.Dizi:");
        for (int i =  0; i < dizi1.length; i++){
            System.out.println(dizi1[i]);
        }
        System.out.println("2.Dizi:");
        for (int i = 0; i < dizi2.length; i++){
            System.out.println(dizi2[i]);
        }
        //yeni dizi oluşsun:
        for (int i = 0; i < yeniDizi.length; i++){
            yeniDizi[i][0] = dizi1[i];
            yeniDizi[i][1] = dizi2[i];
            yeniDizi[i][2] = dizi1[i] * dizi2[i];
        }
        //yeni diziyi yazdıralım:
        System.out.println("Yeni Dizi:");
        for (int i = 0; i < yeniDizi.length; i++){
            for (int j = 0; j < yeniDizi.length; j++){
                System.out.print(yeniDizi[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void kare(){
        int[] dizi1 = new int[3];
        int[] dizi2 = new int[3];
        int[] dizi3 = new int[3];
        int[][] yeniMatris = new int[3][3];

        Scanner scr = new Scanner(System.in);
        //kullanıcı 3 dizi için değer girsin:
        System.out.print("Lütfen 1. dizinin üç elemanını giriniz:");  //iç içe?
        for (int i = 0; i < dizi1.length; i++){
            dizi1[i] = scr.nextInt();
        }
        System.out.println("1. dizi oluşturuldu.");
        System.out.println();

        System.out.print("Lütfen 2. dizinin üç elemanını giriniz:");
        for (int i = 0; i < dizi2.length; i++){
            dizi2[i] = scr.nextInt();
        }
        System.out.println("2. dizi oluşturuldu.");
        System.out.println();

        System.out.print("Lütfen 3. dizinin üç elemanını giriniz:");
        for (int i = 0; i < dizi3.length; i++){
            dizi3[i] = scr.nextInt();
        }
        System.out.println("3. dizi oluşturuldu.");
        System.out.println();

        //bu dizilerin birleşmesiyle yeni bir matris oluşturalım:
        System.out.println("3x3'lük yeni bir matris oluşturuldu.");
        for (int i = 0; i < yeniMatris.length; i++){
            yeniMatris[0][i] = dizi1[i];
            yeniMatris[1][i] = dizi2[i];
            yeniMatris[2][i] = dizi3[i];
        }
        //yeni matrisi ekrana yazdıralım:
        for (int i = 0; i < yeniMatris.length; i++){
            for (int j = 0; j < yeniMatris.length; j++){
                System.out.print(yeniMatris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //yeni matrisi sağ ve sol köşegenlerinin karesini alarak oluşturalım:
            yeniMatris[0][0] = (int) Math.pow(yeniMatris[0][0],2);
            yeniMatris[0][2] = (int) Math.pow(yeniMatris[0][2],2);
            yeniMatris[1][1] = (int) Math.pow(yeniMatris[1][1],2);
            yeniMatris[2][2] = (int) Math.pow(yeniMatris[2][2],2);
            yeniMatris[2][0] = (int) Math.pow(yeniMatris[2][0],2);

            System.out.println("Matrisin değişen sonuçları:");
            for (int i = 0; i < yeniMatris.length; i++){
                for (int j = 0; j < yeniMatris.length; j++){
                    System.out.print(yeniMatris[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Yeni bir matris daha oluşturuldu.");
    }
    public static void dongu(){
        System.out.println("N\t10*N\t100*N\t1000*N");
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 1000; j *= 10){
                System.out.print(i * j + " \t ");
            }
            System.out.println();
        }
    }
}