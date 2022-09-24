public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"AA","BB",3000,2,"Hello");
        /*product.setId(1);
        product.setDescription("Asus Laptop");
        product.setName("Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);*/

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


    }
}