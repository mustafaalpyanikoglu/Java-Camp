public class Main {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade)
        {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Malesef : Geçtiniz");
                break;
            default:
                System.out.println("Geçeersiz not girdiniz!");
                break;
        }
    }
}