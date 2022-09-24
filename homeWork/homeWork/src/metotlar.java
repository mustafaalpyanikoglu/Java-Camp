public class metotlar {
    public static void main(String[] args) {
        String isim = "alp";
        mesajVer(isim);
        mesajVer(isim);
        mesajVer(isim);

        hesapla();
        hesapla();

        topla(3,5);
        toplananIkiSayininYuzdeOnu(10,30);
    }
    public static void mesajVer(String isim)
    {
        System.out.println("Merhaba " + isim);
    }
    public static void hesapla()
    {
        System.out.println("Hesaplandı");
    }
    public static int topla(int sayi1, int sayi2)
    {
        return sayi1 + sayi2;
    }
    public static double toplananIkiSayininYuzdeOnu(int sayi1, int sayi2)
    {
        int toplam = topla(sayi1,sayi2);
        return toplam * 10/100;
    }
    public static double krediHesapla(double krediMiktari)
    {
        //hesaplar yapılır
        return 12500;
    }
}
