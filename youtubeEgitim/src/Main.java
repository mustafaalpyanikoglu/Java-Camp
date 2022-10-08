public class Main {
    public static void main(String[] args) {
        //reditManager creditManager = new CreditManager();
        //creditManager.Calculate();
        //creditManager.Save();


        //Customer customer = new Customer();
        //customer.Id = 1;
        //customer.City = "Adana";

        //CustomerManager customerManager = new CustomerManager(customer);

        //customerManager.Save();
        //customerManager.Delete();

        //Company company = new Company();
        //company.taxNumber = "1000";
        //company.companyName = "LG";
        //company.Id = 100;

        //CustomerManager customerManager2 = new CustomerManager(new Person());



        //Person person = new Person();

        //company.taxNumber = "11111";
        //person.nationalIdentity = "12346848";

        //INTERFACE
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();
    }
}