import java.util.Scanner;
    public class lesson6_3 {
        public static void main(String[] args) {
            System.out.print("Enter a and b: ");
            Scanner in = new Scanner(System.in);



            int a = in.nextInt();
            int b = in.nextInt();
            dos (a);
            System.out.println();
            for (int i=0;i<b;i++) {
                System.out.print("|");
                for (int c=0;c<a;c++) {
                    System.out.print(" ");
                }
                System.out.println("|");
            }
            dos (a);
            System.out.println();
            System.out.print("Enter a ");
            int d = in.nextInt();
            int e=1;
            for (int y=1;y<d;y++) {
                e=e*(y+1);
            }
            System.out.print(e);
        }
        static void dos (int a){
            System.out.print(" ");
            for (int i=0;i<a;i++) {
                System.out.print("-");
            }}


    }


