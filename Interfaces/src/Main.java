public class Main {
    public static void main(String[] args) {
        //ICustomerDal customerDal = new MySqlCustomerDal();
        //customerDal.Add();

        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}