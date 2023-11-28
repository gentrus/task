import java.util.Scanner;
public class lesson7_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.println(kor(a));
    }
    static double kor (int a) {

        if (a==1) {
            return 1;
        }

        if (a<1) {
            System.out.println("Ошибка выражения");
        }

        return Math.sqrt(a+Math.sqrt(kor(a-1)));
    }

}
