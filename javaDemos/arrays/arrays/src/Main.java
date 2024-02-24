public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Yaren";
        ogrenciler[1] = "Berkay";
        ogrenciler[2] = "Selenay";
        ogrenciler[3] = "Gokay";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }


        for (String ogrenci : ogrenciler) {   //ogrencilerdeki ogrenciyi tutuyor

            System.out.println(ogrenci); //ogrenciler dizisindeki her bir elemanı gez onlara ogrenci diye isim atadım.
        }
    }
}