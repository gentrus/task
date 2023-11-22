import java.util.Scanner;
public class lesson6_2 {
    /**
     * Декомпозировать задачу
     * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task4.java">...</a>
     * Вынести в отдельный метод логику, которая отрабатывает,
     * когда первое число кратно и двум, и трем.
     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a: ");
            int a = scanner.nextInt();

            System.out.print("Enter b: ");
            int b = scanner.nextInt();

            scanner.close();

            if (a % 2 == 0 || b % 3 == 0) {
                System.out.println(a == b);
            }

            if (a % 2 == 0 && a % 3 == 0) {
                say(a, b);
            }
        }

        static void say(int a, int b) {
            double result = Math.pow(a, b);

            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println((int) result);
                System.out.println();
                System.out.println();
                System.out.println();
            }
        }
    }