public class Main {
    public static void main(String[] args) {

        //bölgeler ve o bölgelerdeki şehirleri dizi ve iç içe döngüler kullanarak yazalım.

        String[][] sehirler = new String[3][3];  //3 bölge için 3 şehir tanımlayalım.

        sehirler[0][0] = "İstanbul";   //3x3=9 olduğu için 9 şehir
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {   //i<=2 çünkü 0,1,2 olmak üzere 3 indis tanımlı.

            if (i == 0) {
                System.out.println("Marmara Bölgesi:");
            }
            if (i == 1) {
                System.out.println("İç Anadolu Bölgesi:");
            }
            if (i == 2) {
                System.out.println("Güneydoğu Anadolu Bölgesi:");
            }

            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
            System.out.println("");
        }
    }
}