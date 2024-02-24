import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new SqlServerDataBaseManager(); //müşteri sql ise
        customerManager.getCustomers();







    }
}