import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String ogr1 = "Engin";
        String ogr2 = "Derin";
        String ogr3 = "Salih";
        String ogr4 = "Alp";

        System.out.println(ogr1);
        System.out.println(ogr2);
        System.out.println(ogr3);
        System.out.println(ogr4);

        String[] students = new String[4];
        students[0] = ogr1;
        students[1] = ogr2;
        students[2] = ogr3;
        //students[3] = ogr4;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println("-----------");
        for (String student: students)
        {
            System.out.println(student);
        }
    }
}