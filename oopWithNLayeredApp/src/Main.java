import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1,"IPhone Xr",1000);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(), List.of(loggers));
        productManager.add(product);
    }
}