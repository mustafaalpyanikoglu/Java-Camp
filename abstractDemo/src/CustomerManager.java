public class CustomerManager {

    BaseDatabaseManager baseDatabaseManager;

    public void getCustomer()
    {
        System.out.println("Kullanıcı getirildi");
        baseDatabaseManager.getData();
    }
}
