import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rnd = new Random();
        int [] dizi = new int[] {1,3,5,7,9};
        int [] smallCevap = new int[3];
        int [] cevap = new int[10];

        for (int i=0; i<3; i++)
        {
            int [] secilen = new int [3];
            secilen [i] = dizi[rnd.nextInt(dizi.length)];
            System.out.println("1 X " +secilen[i] + " = " + 1 * secilen[i]);
            smallCevap[i] = 1*secilen[i];
            cevap[i] = 1*secilen[i];
        }
        System.out.println();
        int min = smallCevap[0];
        for(int i=0; i<smallCevap.length; i++)
        {
            if(smallCevap[i]<min)
            {
                min = smallCevap[i];
            }
        }
        int kat = 3;
        for(int i=3; i<=9; i++)
        {
            System.out.println(min + " X " + i + " = " + min*i);
            cevap[kat] = min*i;
            kat++;
        }
        System.out.print("Sayılarımız: ");
        for(int i=0; i<cevap.length; i++)
        {
            System.out.print(cevap[i]+" ");
        }
        System.out.println();
        int min2 = cevap[0];
        for (int i=0; i<cevap.length; i++)
        {
            if(cevap[i]<min2)
            {
                min2 = cevap[i];
            }
        }
        int max = cevap[0];
        for (int i=0; i<cevap.length; i++)
        {
            if(cevap[i]>max)
            {
                max = cevap[i];
            }
        }

        System.out.println("En küçük değer: " + min2);
        System.out.println("En büyük değer: " + max);


    }
}