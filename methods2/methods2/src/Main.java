public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String newMesaj = mesaj.substring(0,2);
        System.out.println(newMesaj);
        System.out.println(sum(3,5));
        System.out.println(sum2(3,5,4,2,3,6,8,7,4,9));
    }

    public  static  void add()
    {
        System.out.println("Eklendi");
    }
    public  static  void delete()
    {
        System.out.println("Silindi");
    }
    public  static  void update()
    {
        System.out.println("Güncellendi");
    }
    public  static  int sum(int number1,int number2)
    {
        return number1+number2;
    }
    public  static  String giveCity()
    {
        return "Ankara";
    }
    public  static  int sum2(int... numbers)
    {
        int totalSum = 0;
        for (int number:numbers) {
            totalSum += number;
        }
        return  totalSum;
    }
}