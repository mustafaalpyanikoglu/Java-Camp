public class Product {
    //attribute || field
    public Product(int id,String name, String description, double price, int stockAmount, String code)
    {
        System.out.println("Yapıcı blok çalıştı");
        this._id=id;
        this._name = name;
        this._price = price;
        this._description = description;
        this._stockAmount = stockAmount;
        this._code = code;
    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private  String _code;

    public int getId() {
        return _id;
    }
    public void setId(int id){
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double price) {
        this._price = price;
    }

    public int getStockAmount() {
        return _stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String getCode() {
        return _code;
    }

    public void setCode(String code) {
        this._code = code;
    }
}
