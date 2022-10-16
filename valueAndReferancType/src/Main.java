public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{3,4};
        int[] sayilar2 =new int[]{6,7};

        System.out.println("sayilar ve sayilar2 dizisinin ilk halleri");

        System.out.println("sayilar dizisi elemanları : " + sayilar[0]+ ","+ sayilar[1]);
        System.out.println("sayilar2 dizisi elemanları : " + sayilar2[0] + "," +sayilar2[1]);

        System.out.println("sayilar dizisi artık sayilar2 dizisinin işaret ettiğ yeri işaret ediyor");
        sayilar = sayilar2;
        System.out.println("sayilar dizisi elemanları : " + sayilar[0]+ ","+ sayilar[1]);

        System.out.println("sayilar2 dizisini güncellersek sayilar dizisindeki elemanda değişir");
        sayilar2[0] = 10;

        System.out.println("sayilar dizisi elemanları : " + sayilar[0]+ ","+ sayilar[1]);
        System.out.println("sayilar2 dizisi elemanları : " + sayilar2[0] + "," +sayilar2[1]);


    }
}