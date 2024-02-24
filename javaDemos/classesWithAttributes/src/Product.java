public class Product {

    public Product(){ //constructor
        System.out.println("Yapıcı blok çalıştı.");
    }

    //attributes | field
    private int id;  //değişken üstü sağ tık refactor encapsulate fields. kapsullemek istediklerini sec.
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;  //this benim içerisinde bulundupum class demek. procudtın idsi = id
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
