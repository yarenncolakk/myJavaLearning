public class BaseKrediManager {
    public double hesapla(double tutar) {  //public final double olsaydi overriding yapılamazdı.
        return tutar * 1.18;
    }
}
//overriding yapılması istenmiyorsa --> final