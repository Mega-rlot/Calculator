import java.text.MessageFormat;
import java.util.Scanner;

//создаём основной класс
public class Calculator2 {

    //создаём основной метод
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 0, чтобы выйти");
            System.out.println("Введите 1, чтобы включить калькулятор квадратных уравнений через Дискриминант");
            System.out.println("Введите 2, чтобы включить калькулятор квадратных уравнений по т.Виета");
            System.out.println("Введите 3, чтобы включить калькулятор разложения квадратного трёхчена или уравнения на множители");
            System.out.println("Введите 4, чтобы включить калькулятор математических действий");
            System.out.println("Введите 5, чтобы найти факториал");
            System.out.println("Введите 6, чтобы возвести в степень");
            System.out.println("Введите 7, чтобы извлечь квадратный или кубический корень");
            System.out.println("Введите 8, чтобы включить рандомайзер");
            System.out.println("Введите 9, чтобы найти среднее арифметическое чисел");
            int sc = scanner.nextInt();
            //если нажали 0, то выходим
            if (sc == 0) {
                break;
            }
            //если нажали 1, то включаем решение кв. ур-й через дискриминант
            else if(sc == 1) {
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти или любое число, чтобы продолжить");
                    double brk = scanner.nextDouble();
                    if (brk == 0) {
                        break;
                    }else {
                        Reminder.reminder();
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
                            double k = b * b;
                            double v = -4 * a * c;
                            double d = (b * b) - (4 * a * c);
                            double x1 = (-b + Math.sqrt(d)) / (2 * a);
                            double x2 = (-b - Math.sqrt(d)) / (2 * a);
                            QuadraticEquationDiscriminant.discriminant(a,b,c,d,k,v);
                            if (d > 0) {
                                System.out.println("D > 0, то кв. ур-е имеет 2 корня");
                                QuadraticEquationDiscriminant.IfDiscriminateIsGreaterThan0(a,b,d,x1,x2);
                            } else if (d == 0) {
                                double x = -(b / (2 * a));
                                System.out.println("D = 0, то кв. ур-е имеет 1 корень");
                                QuadraticEquationDiscriminant.IfTheDiscriminantIs0(a,b,x);
                            } else {
                                System.out.println("D < 0, то кв. ур-е не имеет действительных корней");
                            }
                        }
                    }
                }
            }else if(sc == 2){
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти или любое число, чтобы продолжить");
                    double brk = scanner.nextDouble();
                    if (brk == 0) {
                        break;
                    } else {
                        Reminder.reminder();
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
                            double p = b / a;
                            double q = c / a;
                            double sqrt = (p / 2) * (p / 2);
                            double x1 = -(p / 2) + Math.sqrt(sqrt - q);
                            double x2 = -(p / 2) - Math.sqrt(sqrt - q);
                            QuadraticEquationAccordingToVietaTheorem.quadraticEquationAfterTheReduction(a,b,c);
                            if (a != 1) {
                                QuadraticEquationAccordingToVietaTheorem.quadraticEquation(a, p, q);
                            }
                            QuadraticEquationAccordingToVietaTheorem.decision(p, q, sqrt, x1, x2);
                            if (x1 == (int) x1 && x2 == (int) x2) {
                                System.out.println("ИЛИ");
                                if (a != 1) {
                                    QuadraticEquationAccordingToVietaTheorem.quadraticEquation(a, p, q);
                                }
                                QuadraticEquationAccordingToVietaTheorem.ifTheValuesAreNotFractional(p, q, x1, x2);
                                    } else {
                                        System.out.println("");
                                    }
                        }
                    }
                }
            }else if (sc == 3){
                while (true){
                    System.out.println("Нажмите 0, чтобы выйти, или 1, чтобы решить через дискриминант, или 2, чтобы решить через теорему Виета");
                    double brk = scanner.nextDouble();
                    if (brk == 0){
                        break;
                    } else if (brk == 1) {
                        Reminder.reminder();
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
                            double k = b * b;
                            double v = -4 * a * c;
                            double d = (b * b) - (4 * a * c);
                            double x1 = (-b + Math.sqrt(d)) / (2 * a);
                            double x2 = (-b - Math.sqrt(d)) / (2 * a);
                            QuadraticEquationDiscriminant.discriminant(a,b,c,d,k,v);
                            if (d > 0) {
                                System.out.println("D > 0, то кв. ур-е имеет 2 корня");
                                QuadraticEquationDiscriminant.IfDiscriminateIsGreaterThan0(a,b,d,x1,x2);
                                FactorizationOfASquareTrinomial.factorizationIfTheDiscriminantIsGreaterThan0(a,b,c,x1,x2);
                            } else if (d == 0) {
                                double x = -(b / (2 * a));
                                System.out.println("D = 0, то кв. ур-е имеет 1 корень");
                                QuadraticEquationDiscriminant.IfTheDiscriminantIs0(a,b,x);
                                FactorizationOfASquareTrinomial.factorizationIfTheDiscriminantIs0(a,b,c,x);
                            } else {
                                System.out.println("D < 0, то кв. ур-е не имеет действительных корней");
                                FactorizationOfASquareTrinomial.factorizationIfTheDiscriminantIsLessThan0();
                            }
                        }
                    } else {
                        Reminder.reminder();
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
                            double p = b / a;
                            double q = c / a;
                            double sqrt = (p / 2) * (p / 2);
                            double x1 = -(p / 2) + Math.sqrt(sqrt - q);
                            double x2 = -(p / 2) - Math.sqrt(sqrt - q);
                            QuadraticEquationAccordingToVietaTheorem.quadraticEquationAfterTheReduction(a,b,c);
                            if (a != 1) {
                                QuadraticEquationAccordingToVietaTheorem.quadraticEquation(a, p, q);
                            }
                            QuadraticEquationAccordingToVietaTheorem.decision(p, q, sqrt, x1, x2);
                            if (x1 == (int) x1 && x2 == (int) x2) {
                                System.out.println("ИЛИ");
                                if (a != 1) {
                                    QuadraticEquationAccordingToVietaTheorem.quadraticEquation(a, p, q);
                                }
                                QuadraticEquationAccordingToVietaTheorem.ifTheValuesAreNotFractional(p, q, x1, x2);
                            } else {
                                System.out.println("");
                            }
                            FactorizationOfASquareTrinomial.factorizationIfTheDiscriminantIsGreaterThan0(a,b,c,x1,x2);
                        }
                    }
                }
            }else if (sc == 4){
                while (true) {
                    System.out.println("Выберите пункт");
                    System.out.println("1 - сложение");
                    System.out.println("2 - вычитание");
                    System.out.println("3 - умножение");
                    System.out.println("4 - деление");
                    System.out.println("5 - выйти");
                    int person = scanner.nextInt();
                    int result;
                    if (person == 5) {
                        break;
                    } else if (person == 1) {
                        System.out.println("Вы выбрали сложение");
                        System.out.println("Введите первое число: ");
                        int a = scanner.nextInt();
                        System.out.println("Введите второе число: ");
                        int b = scanner.nextInt();
                        result = a + b;
                        System.out.println("Ответ: " + result);
                    } else if (person == 2) {
                        System.out.println("Вы выбрали вычитание");
                        System.out.println("Введите первое число: ");
                        int a = scanner.nextInt();
                        System.out.println("Введите второе число: ");
                        int b = scanner.nextInt();
                        result = a - b;
                        System.out.println("Ответ: " + result);
                    } else if (person == 3) {
                        System.out.println("Вы выбрали умножение");
                        System.out.println("Введите первое число: ");
                        int a = scanner.nextInt();
                        System.out.println("Введите второе число: ");
                        int b = scanner.nextInt();
                        result = a * b;
                        System.out.println("Ответ: " + result);
                    } else if (person == 4) {
                        System.out.println("Вы выбрали деление");
                        System.out.println("Введите первое число: ");
                        double a = scanner.nextDouble();
                        System.out.println("Введите второе число: ");
                        double b = scanner.nextDouble();
                        if (b == 0) {
                            System.out.println("На ноль делить нельзя");
                        }
                        result = (int) (a / b);
                        System.out.println("Ответ: " + result);
                    }
                    System.out.println("Действие завершено!");
                }
            }else if (sc == 5){
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти или 1, чтобы продолжить");
                    int exit = scanner.nextInt();
                    if (exit == 0) {
                        break;
                    } else {
                        System.out.println("Введите коэффициент факториала");
                        int a = scanner.nextInt();
                        System.out.print("Факториал равен: ");
                        System.out.println(classFactorial.factorial(a));
                    }
                }
            }else if (sc == 6){
                while (true){
                    System.out.println("Нажмите 0, чтобы выйти или 1, чтобы продолжить");
                    int exit = scanner.nextInt();
                    if (exit == 0) {
                        break;
                    } else {
                        System.out.println("Введите число, которое хотите возвести в степень");
                        double x = scanner.nextDouble();
                        System.out.println("Введите коэффициент степени");
                        int a = scanner.nextInt();
                        double r = Math.pow (x, a);
                        System.out.println("Ответ: " + r);
                    }
                }
            }else if (sc == 7){
                while (true){
                    System.out.println("Нажмите 0, чтобы выйти или 1, чтобы продолжить");
                    int exit = scanner.nextInt();
                    if (exit == 0){
                        break;
                    } else {
                        System.out.println("Для извлечения квадратного корня нажмите 1, " +
                                "для извлечения кубического корня нажмите 2");
                        int a = scanner.nextInt();
                        if (a == 1){
                            System.out.println("Введите чило, из которого хотите извлечь квадратный корень");
                            double c = scanner.nextDouble();
                            double r = Math.sqrt(c);
                            System.out.println("Ответ: " + r);
                        }else {
                            System.out.println("Введите чило, из которого хотите извлечь кубический корень");
                            double d = scanner.nextDouble();
                            double r = Math.cbrt(d);
                            System.out.println("Ответ: " + r);
                        }
                    }
                }
            }else if (sc == 8){
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти, или 1, чтобы заполнить массив различными числами ," +
                            "или 2, чтобы получить рандомное чило");
                    int stop = scanner.nextInt();
                    if(stop == 0){
                        break;
                    }else if (stop == 1){
                        System.out.println("Введите введите длину массива");
                        int mas = scanner.nextInt();
                        int[] mass = new int[mas];
                        System.out.println("Введите минимальное рандомное число");
                        int min = scanner.nextInt();
                        System.out.println("Введите максимальное рандомное число");
                        int max = scanner.nextInt();
                        for (int i = 0; i < mass.length; i++) {
                            mass[i] = (int) (Math.random() * max) + min;
                            if (mass[i] > max) {
                                int difference = (max - min) + 1;
                                int y = (int) ((Math.random() * difference) + 1);
                                mass[i] = (min + y) - 1;
                                System.out.print(mass[i]);
                                System.out.print(" ");
                            } else {
                                System.out.print(mass[i]);
                                System.out.print(" ");
                            }

                        }
                    }else {
                        System.out.println("Введите минимальное рандомное чило");
                        int rand1 = scanner.nextInt();
                        System.out.println("Введите максимальное рандомное чило");
                        int rand2 = scanner.nextInt();
                        int x = (int) ((Math.random() * rand2) + rand1);
                        if (x > rand2){
                            int difference = (rand2 - rand1) + 1;
                            int y = (int) ((Math.random() * difference) + 1);
                            x = (rand1 + y) - 1;
                            System.out.println("ваше рандомное число = " + x);
                        }else {
                            System.out.println("ваше рандомное число = " + x);
                        }
                    }
                }
            }else if (sc == 9){
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти или любое число, чтобы продолжить");
                    int brk = scanner.nextInt();
                    if (brk == 0) {
                        break;
                    }else {
                        System.out.println("Введите кол-во чисел");
                        int massiv = scanner.nextInt();
                        int num [] = new int[massiv];
                        double medium = 0;
                        for (int i = 0; i < num.length; i++) {
                            System.out.println("Введите " + (i + 1) +"-e число:");
                            double x = scanner.nextDouble();
                            medium = medium + x;
                        }
                        double result = medium/num.length;
                        String result1 = String.format("%.2f",result);
                        System.out.println("среднее арифметическое чисел равно: " + result1);

                    }
                }
            }
        }
    }
}

class Reminder{
    public static void reminder(){
        System.out.println("Напоминаю, что в уравнении ax²+bx+c=0 коэффицентами являются: \n" + "a - старший коэффицент(причём он не равен нулю) \n" +
        "b - второй коэффицент \n" + "c - свободный член \n" );
    }
}

class QuadraticEquationDiscriminant {
    public static void discriminant(double a, double b, double c , double d, double k, double v) {
        String D = "D = b² - 4ac = " +
                (b > 0 ? b : "(" + b + ")") + "² - 4 * " + (a > 0 ? a : "(" + a + ")") +
                " * " + (c > 0 ? c : "(" + c + ")") + " = " + k  + (v > 0 ?" + " + v: " - " + (-v)) + " = " + d;
        System.out.println(D);
    }
    //решение, если Дискриминант больше 0
    public static void IfDiscriminateIsGreaterThan0(double a,double b,double d, double x1, double x2){
        String X1_2 = "X₁,₂ = -b +- √D / 2a =" + " -" + (b > 0 ? b : "(" + b + ")") + " +- " + "√" + d + " / " +
                "2 * " + (a > 0 ? a : "(" + a + ")") + " = " +
                "-" + (b > 0 ? b : "(" + b + ")") + " +- " + Math.sqrt(d) + " / " + (2 * a);
        String X1 = "x₁ = " + "-" + (b > 0 ? b : "(" + b + ")") + " + " + Math.sqrt(d) + " / " + (2 * a) +
                " = " + (-b + Math.sqrt(d)) + " / " + (2 * a) + " = " + x1;
        String X2 = "x₂ = " + "-" + (b > 0 ? b : "(" + b + ")") + " - " + Math.sqrt(d) + " / " + (2 * a) +
                " = " + (-b - Math.sqrt(d)) + " / " + (2 * a) + " = " + x2;
        System.out.println(MessageFormat.format("{0} \n{1} \n{2}", X1_2, X1, X2));
    }
    //решение, если Дискриминант равен 0
    public static void IfTheDiscriminantIs0(double a, double b, double x){
        String X = "x = -b / 2a = -" + (b > 0 ? b : "(" + b + ")") + " / " + "2 * " + (a > 0 ? a : "(" + a + ")") + " = " +
                "-" + (b > 0 ? b : "(" + b + ")") + " / " + (2 * a) + " = " + x;
        System.out.println(X);
    }
}
class QuadraticEquationAccordingToVietaTheorem {
    public static void quadraticEquationAfterTheReduction(double a, double b, double c){
        String reducedQE = "Получилось уравнение " + a + "x²+" + (a > 0 ? a: "(" + a + ")") + "x+" + (c > 0 ? c: "(" + c + ")") + " = 0";
        System.out.println(reducedQE);
    }
    //кв. ур-е, если a != 1
    public static void quadraticEquation(double a, double p, double q) {
        String qE = "Делим обе части уравнения на " + a + "и получаем приведёенное кв. ур-е " +
                "x+² " + (p > 0 ? + p: "(" + p + ")") + " x+" + (q > 0 ? q: "(" + q + ")") + " = 0";
        System.out.println(qE);
    }
    //решение
    public static void decision(double p,double q,double sqrt, double x1, double x2){
        String formula = "X₁,₂ = - p/2 +- √(p/2)² - q;";
        String X1_2 = "X₁,₂ = - " + (p > 0 ? p: "(" + p + ")") + "/" + "2 +- √(" + p + "/2)² - " + (q > 0 ? q: "(" + q + ")") + " = " +
                (-(p / 2)) + " +- √" + (p / 2) + "² - " + (q > 0 ? q: "(" + q + ")") + " = " +
                (-(p / 2)) + " +- √" + sqrt + " - " + (q > 0 ? q: "(" + q + ")") + " = " +
                (-(p / 2)) + " +- √" + (sqrt - q) + " = " + (-(p / 2)) + " +- " + Math.sqrt(sqrt - q);
        String X1 = "x₁ = " + (-(p / 2)) + " + " + Math.sqrt(sqrt - q) + " = " + x1;
        String X2 = "x₂ = " + (-(p / 2)) + " - " + Math.sqrt(sqrt - q) + " = " + x2;
        System.out.println(MessageFormat.format("{0} \n{1} \n{2} \n{3}", formula, X1_2, X1, X2));
    }

    public static void ifTheValuesAreNotFractional(double p, double q, double x1, double x2) {
        String condition = "p = " + p + "; q = " + q;
        String condition2 = "x₁+x₂ = -p; x₁x₂ = q";
        String X1plusX2 = "x₁+x₂ = " + (-p);
        String X1X2 = "x₁x₂ = " + q;
        String X1andX2 = "x₁ = " + x1 + "; x₂ = " + x2;
        System.out.println(MessageFormat.format("{0} \n{1} \n{2} \n{3} \n{4}", condition, condition2, X1plusX2, X1X2, X1andX2));
    }

}
class FactorizationOfASquareTrinomial {
    public static void factorizationIfTheDiscriminantIsGreaterThan0(double a, double b, double c, double x1, double x2){
        double ax1 = a * (-x1);
        System.out.println("ax²+bx+c = a(x-x₁)(x-x₂)");
        System.out.println(a + "x²+" + (b > 0 ? b: "(" + b + ")") + "x+" + (c > 0 ? c: "(" + c + ")") + " = " +
                a + "(x-" + (x1 > 0 ? x1: "(" + x1 + ")") + ")(x-" + (x2 > 0 ? x2: "(" + x2 + ")") + ")");
        System.out.println(a + "x²" + (b > 0 ? "+" + b: b) + "x" + (c > 0 ? "+" + c: c) + " = (" +
                a + "x" + ((ax1) > 0 ? "+" + (ax1): (ax1)) + ")(x" + (x2 > 0 ? x2: "+" + (-x2)) + ")");
    }

    public static void factorizationIfTheDiscriminantIs0(double a,double b, double c, double x){
        double ax = a * (-x);
        System.out.println("ax²+bx+c = a(x-x₁)²");
        System.out.println(a + "x²+" + (b > 0 ? b: "(" + b + ")") + "x+" + (c > 0 ? c: "(" + c + ")") + " = " +
                a + "(x-" + (x > 0 ? x: "(" + x + ")") + ")²");
        System.out.println(a + "x²" + (b > 0 ? "+" + b: "-" + b) + "x" + (c > 0 ? "+" + c: "-" + c) + " = (" +
                a + "x" + ((ax) > 0 ? "+" + (ax): (ax)) + ")²");
    }

    public static void factorizationIfTheDiscriminantIsLessThan0(){
        System.out.println("Квадратный трёхчлен нельзя разложить на множители");
    }
}

class classFactorial {
    static int factorial(int a) {
        if (a == 1){
            return 1;
        }else {
            return a * factorial(a - 1);
        }
    }
}

