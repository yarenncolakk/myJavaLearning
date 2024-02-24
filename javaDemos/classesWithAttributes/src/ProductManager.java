public class ProductManager {
    public void Add(Product product) {
        //JDBC kodlayıyla veritabanına kaydedili.
        System.out.println("Ürün eklendi: " + product.getName());
    }
}
