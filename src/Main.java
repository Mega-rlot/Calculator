import java.util.Scanner;

public class Main {

    private static String discriminant;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Нажмите 0, чтобы выйти или любое число, чтобы продолжить");
            double brk = scanner.nextDouble();
            if (brk == 0) {
                break;
            } else {
                System.out.println("Напоминаю, что в уравнении ax²+bx+c=0 коэффицентами являются: ");
                System.out.println("a - старший коэффицент(причём он не равен нулю)");
                System.out.println("b - второй коэффицент");
                System.out.println("c - свободный член");
                System.out.println("");
                System.out.println("Пожалуйста, введите значение a");
                double a = scanner.nextDouble();
                if (a == 0) {
                    System.out.println("Значение не может быть равно нулю");
                } else {
                    System.out.println("Пожалуйста, введите значение b");
                    double b = scanner.nextDouble();
                    System.out.println("Пожалуйста, введите значение c");
                    double c = scanner.nextDouble();
                    System.out.println("Выполняю вычисления...");
                    int examination = (int) (a * c);
                    double d = (b * b) - (4 * a * c);
                    double k = b * b;
                    double v = -4 * a * c;
                    System.out.println("Получилось уравнение " + a + "x²+" + b + "x" + c + " = 0");
                    discriminant(a,b,c,d,k,v);


                }
            }
        }
    }
            public static String discriminant ( double a, double b, double c ,double d, double k, double v){
                String D = "D = b² - 4ac = " + b + "² - 4 * " + a + " * " + c + " = " + k + " + " + v + " = " + d;
                System.out.println(D);
                return D;
    }

}
