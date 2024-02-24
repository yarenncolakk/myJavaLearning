public class OgrenciKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) { //aynı hesapla olduğu için buradaki hesapla çalışır.
        return tutar * 1.10;
    }

}

//BaseKrediManager'daki hesapla burası için ezilir
//üzerine yazılabilir --> overriding