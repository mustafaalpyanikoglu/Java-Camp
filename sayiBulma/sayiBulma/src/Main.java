public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int aranacak = 3;

        for (int i = 0; i < numbers.length; i++) {
            if(aranacak == numbers[i])
            {
                System.out.println("Sayı var");
                return;
            }
        }
        System.out.println("Sayı yok");
    }
}