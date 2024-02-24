public abstract class GameCalculator {

    //gameOver herkes için aynıdır ancak puan hesabı herhes için ayrıca yazılmalıdır.
    //yani hesapla override edilmelidir.
    public abstract void hesapla();
    // {System.out.println("Puanınız: 100");}

    public final void gameOver(){  //final--> override istenmiyor.
        System.out.println("Oyun bitti.");
    }
}

//overriding yaparak puanlama kişiler için değiştirilebilir. ya da abstract ile

//abstract--> ben base'de bunu belirlemek istemiyorum ama kim miras alıyorsa o override etmek zorunda.
//ama benim yazdığım fonks ile--> hesapla()
//abstract sınıflar new'lenemez. içi doldurularak newlenebilir.
