public class Main {
    public static void main(String[] args) {
        //try-catch

        try {
            int[] sayilar = new int[] {1,2,3};
            System.out.println(sayilar[5]);
        }
        catch (StringIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        catch (ArrayIndexOutOfBoundsException exception)
        {
            System.out.println(exception);
        }
        catch (Exception exception) //outputtaki hata catch blokuna parametre olarak verilir. birden fazla catch olabilir.
        {
            System.out.println("Loglandı : " + exception);
        }
        finally {
            //bu blok her türlü çalışır.
            System.out.println("Finally her türlü çalışır");
        }

    }
}