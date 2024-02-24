import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int [] dizi1 = new int[3];
        int [] dizi2 = new int[3];
        int [] number= new int [] {1,5,4,3,7};

        int [][] dizi3 = new int [3][3];

        for (int i=0; i<dizi1.length; i++)
        {
            dizi1[i] = number [rnd.nextInt(number.length)];
            dizi2[i] = number [rnd.nextInt(number.length)];
        }
        System.out.println("3x1'lik 2 ayrı dizi oluşturuldu");
        System.out.println();

        System.out.println("1.dizi");
        for (int i =0; i<dizi1.length; i++)
        {
            System.out.println(dizi1[i]);
        }
        System.out.println();

        System.out.println("2.dizi");
        for(int i=0; i<dizi2.length; i++)
        {
            System.out.println(dizi2[i]);
        }
        System.out.println();

        System.out.println("yeni dizi :");
        for(int i=0; i<dizi1.length; i++)
        {
            dizi3 [i][0] = dizi1[i];
            dizi3 [i][1] = dizi2[i];
            dizi3 [i][2] = dizi1[i]*dizi2[i];
        }
        for(int i=0; i<dizi3.length; i++)
        {
            for(int j=0; j<dizi3.length; j++)
            {
                System.out.print(dizi3[i][j]+" ");
            }
            System.out.println();
        }

    }
}