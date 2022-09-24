public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        int number3 = 30;

        int maximal = number1;

        if(maximal<number2)
            maximal = number2;
        if(maximal<number3)
            maximal = number3;
        System.out.println("En büyük = "+maximal);
    }
}