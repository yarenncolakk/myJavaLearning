public class KronometreThread implements Runnable{

    private Thread thread;
    private String threadName; //threadlerin çalışabiliyor olması için birbirinden ayırt edilebiliyor olması lazım.

    public KronometreThread (String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor: " + threadName );
    }
    @Override
    public void run() { //içerisine yazılanlar thread olarak çalışacaktır.
        System.out.println("Çalıştırılıyor: " + threadName);

      try
      {
          for(int i=1; i<=10; i++){
              System.out.println(threadName + " : " + i);
              Thread.sleep(1000); //yaz 1sn bekle.
          }
      }
      catch (InterruptedException e){ //thread bozulursa.
          System.out.println("Kesildi: " + threadName);
      }

      System.out.println("Thread İşlemi Bitti: " + threadName);
    }

    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}
