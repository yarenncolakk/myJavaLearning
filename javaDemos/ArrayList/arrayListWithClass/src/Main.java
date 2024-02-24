import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer engin = new Customer(1,"Engin","Demir");
        customers.add(engin);
        customers.add(new Customer(2,"Derin","Demir"));
        customers.add(new Customer(3,"Salih","Demir"));

        //hepsi new ile oluşturulduğu için remove yapılamaz. new1 new2 new3 sil new4, new4 zaten yok.gibi.
        customers.remove(engin); //bu şekilde silme işlemi yapılabilir.


        for(Customer customer : customers)
        {
            System.out.println(customer.firstName);
        }

    }
}