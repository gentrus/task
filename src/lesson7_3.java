import java.util.Scanner;
public class lesson7_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.println(fact(a));
    }
    static int fact (int a) {

        if (a==1) {
            return 1;
        }
        if (a==0) {
            return 0;
        }

        return a*fact(a-1);
        }

    }

