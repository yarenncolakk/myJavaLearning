import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        ArrayList sayilar = new ArrayList();  //arrayliste her türlü veri eklenir. obje ile çalışma:

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.size());
        System.out.println(sayilar.get(2)); //2. indexteki eleman
        sayilar.set(2,100); //2. indexi --> 100 ile değiştir.
        System.out.println(sayilar.get(2));
        sayilar.remove(0); //0. indexteki elemanı siler.
        System.out.println(sayilar.get(0)); //1. index artık 0. index oldu.
        System.out.println();

        for(Object i : sayilar)
        {
            System.out.println(i);
        }
    }
}