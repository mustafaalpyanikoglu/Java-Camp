public class ProductManager {
    public  void Add(Product product)
    {
        String anlamadım = product.getName();
        System.out.println("Ürün eklendi " + anlamadım);
    }

    public void  Add(int id, String name, String description, int stockAmount, double price)
    {

    }
}
