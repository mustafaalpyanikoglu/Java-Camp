public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1, "Mouse", 10));

        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.update();
    }
}