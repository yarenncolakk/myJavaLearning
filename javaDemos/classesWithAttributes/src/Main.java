public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Monster");
        product.setPrice(15000);
        product.setStockAmount(3);

        System.out.println(product.getName());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getId());

    }
}