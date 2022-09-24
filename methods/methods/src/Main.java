public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static  void sayiBulmaca()
    {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int aranacak = 3;

        for (int i = 0; i < numbers.length; i++) {
            if(aranacak == numbers[i])
            {
                mesajVer("Sayı mevcuttu: "+aranacak);
            }
        }
        System.out.println("Sayı mevcut değildir: "+aranacak);
    }

    public  static  void mesajVer(String mesaj)
    {
        System.out.println(mesaj);
    }
}