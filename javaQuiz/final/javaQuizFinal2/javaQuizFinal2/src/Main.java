public class Main {
    public static void main(String[] args) {

        int[] matris1 = new int[]{1,2};
        int[] matris2 = new int[]{3,5};
        int[] matrisToplam = new int[2];
        int[] matrisCikar = new int[2];

        System.out.println("Matris1: [" + matris1[0] + " " + matris1[1] + "]");
        System.out.println("Matris2: [" + matris2[0] + " " + matris2[1] + "]");
        System.out.println();

        System.out.println("Matris 1 Transpoz");
        for(int i = 0; i<matris1.length; i++){
            System.out.println(matris1[i]);
        }
        System.out.println();

        System.out.println("Matris 2 Transpoz");
        for(int i = 0; i<matris2.length; i++){
            System.out.println(matris2[i]);
        }
        System.out.println();

        System.out.println("Matrislerin Toplamı:");
        for (int i = 0; i<matrisToplam.length; i++){
           matrisToplam[i] = matris1[i] + matris2[i];
           System.out.println(matrisToplam[i]);
        }
        System.out.println();

        System.out.println("Matrislerin Çıkarımı:");
        for (int i = 0; i<matrisCikar.length; i++){
            matrisCikar[i] = matris1[i] - matris2[i];
            System.out.println(matrisCikar[i]);
        }
    }
}