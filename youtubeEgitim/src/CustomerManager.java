public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditmanager;
    public CustomerManager(Customer customer, ICreditManager creditManager)

    {
        _customer = customer;
        _creditmanager = creditManager;
    }
    public void Save() {
        System.out.println("Müşteri kaydedildi : " );
    }

    public void Delete() {
        System.out.println("Müşteri silindi : " );
    }

    public void GiveCredit() {
        _creditmanager.Calculate();
        System.out.println("Kredi verildi.");
    }
}
