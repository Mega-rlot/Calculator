import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 0, чтобы выйти");
            System.out.println("Введите 1, чтобы включить калькулятор квадратных уравнений через Дискриминант");
            System.out.println("Введите 2, чтобы включить калькулятор квадратных уравнений по т.Виета");
            System.out.println("Введите 3, чтобы включить калькулятор математических действий");
            System.out.println("Введите 4, чтобы найти факториал");
            System.out.println("Введите 5, чтобы возвести в степень");
            System.out.println("Введите 6, чтобы извлечь квадратный или кубический корень");
            System.out.println("Введите 7, чтобы включить рандомайзер");
            System.out.println("Введите 8, чтобы найти среднее арифметическое чисел");
            int sc = scanner.nextInt();
            if (sc == 0){
                break;
            } else if(sc == 1) {
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти или любое число, чтобы продолжить");
                    double brk = scanner.nextDouble();
                    if (brk == 0) {
                        break;
                    }else {
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
                            double k = b * b;
                            double v = -4 * a * c;
                            int examination = (int) (a * c);
                            if (b > 0) {
                                if (examination < 0) {
                                    System.out.println("Получилось уравнение " + a + "x²+" + b + "x" + c + " = 0");
                                    double D = (b * b) - (4 * a * c);
                                    System.out.println("D = b² - 4ac = " + b + "² - 4 * " + a + " * " + c + " = " +
                                            k + " + " + v + " = " + D);
                                    if (D > 0) {
                                        double x1 = (-b + Math.sqrt(D)) / (2 * a);
                                        double x2 = (-b - Math.sqrt(D)) / (2 * a);
                                        System.out.println("D > 0, то кв. ур-е имеет 2 корня");
                                        System.out.println("X₁,₂ = -b +- √D / 2a =" +
                                                " -" + b + " +- " + "√" + D + " / " + "2 * " + a + " = " +
                                                " - " + b + " +- " + Math.sqrt(D) + " / " + (2 * a));
                                        System.out.println("x₁ = " + " - " + b + " + " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b + Math.sqrt(D)) + " / " + (2 * a) + " = " + x1);
                                        System.out.println("x₂ = " + " - " + b + " - " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b - Math.sqrt(D)) + " / " + (2 * a) + " = " + x2);
                                    } else if (D == 0) {
                                        double x = -(b / (2 * a));
                                        System.out.println("D = 0, то кв. ур-е имеет 1 корень");
                                        System.out.println("x = -b / 2a = -" + b + " / " + "2 * " + a + " = " +
                                                "- " + b + " / " + (2 * a) + " = " + x);
                                    } else {
                                        System.out.println("D < 0, то кв. ур-е не имеет действительных корней");
                                    }
                                } else {
                                    System.out.println("Получилось уравнение " + a + "x²+" + b + "x" + c + " = 0");
                                    double D = (b * b) - (4 * a * c);
                                    System.out.println("D = b² - 4ac = " + b + "² - 4 * " + a + " * " + c + " = " +
                                            k + v + " = " + D);
                                    if (D > 0) {
                                        double x1 = (-b + Math.sqrt(D)) / (2 * a);
                                        double x2 = (-b - Math.sqrt(D)) / (2 * a);
                                        System.out.println("D > 0, то кв. ур-е имеет 2 корня");
                                        System.out.println("X₁,₂ = -b +- √D / 2a =" +
                                                " -" + b + " +- " + "√" + D + " / " + "2 * " + a + " = " +
                                                " - " + b + " +- " + Math.sqrt(D) + " / " + (2 * a));
                                        System.out.println("x₁ = " + " - " + b + " + " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b + Math.sqrt(D)) + " / " + (2 * a) + " = " + x1);
                                        System.out.println("x₂ = " + " - " + b + " - " + Math.sqrt(D) + " / " + (2 * a) +
                                        " = " + (-b - Math.sqrt(D)) + " / " + (2 * a) + " = " + x2);
                                    } else if (D == 0) {
                                        double x = -(b / (2 * a));
                                        System.out.println("D = 0, то кв. ур-е имеет 1 корень");
                                        System.out.println("x = -b / 2a = -" + b + " / " + "2 * " + a + " = " +
                                                "- " + b + " / " + (2 * a) + " = " + x);
                                    } else {
                                        System.out.println("D < 0, то кв. ур-е не имеет действительных корней");
                                    }
                                }
                            }else {
                                if (examination < 0) {
                                    System.out.println("Получилось уравнение " + a + "x²" + b + "x" + c + " = 0");
                                    double D = (b * b) - (4 * a * c);
                                    System.out.println("D = b² - 4ac = " + b + "² - 4 * " + a + " * " + c + " = " +
                                            k + " + " + v + " = " + D);
                                    if (D > 0) {
                                        double x1 = (-b + Math.sqrt(D)) / (2 * a);
                                        double x2 = (-b - Math.sqrt(D)) / (2 * a);
                                        System.out.println("D > 0, то кв. ур-е имеет 2 корня");
                                        System.out.println("X₁,₂ = -b +- √D / 2a = " + (-b) + " +- " + "√" + D + " / " + "2 * " + a + " = " +
                                                 b + " +- " + Math.sqrt(D) + " / " + (2 * a));
                                        System.out.println("x₁ = "  + (-b) + " + " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b + Math.sqrt(D)) + " / " + (2 * a) + " = " + x1);
                                        System.out.println("x₂ = " + (-b) + " - " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b - Math.sqrt(D)) + " / " + (2 * a) + " = " + x2);
                                    } else if (D == 0) {
                                        double x = -(b / (2 * a));
                                        System.out.println("D = 0, то кв. ур-е имеет 1 корень");
                                        System.out.println("x = -b / 2a = " + b + " / " + "2 * " + a + " = " +
                                                 b + " / " + (2 * a) + " = " + x);
                                    } else {
                                        System.out.println("D < 0, то кв. ур-е не имеет действительных корней");
                                    }
                                } else {
                                    double D = (b * b) - (4 * a * c);
                                    System.out.println("D = b² - 4ac = " + b + "² - 4 * " + a + " * " + c + " = " +
                                            k + v + " = " + D);
                                    if (D > 0) {
                                        double x1 = (-b + Math.sqrt(D)) / (2 * a);
                                        double x2 = (-b - Math.sqrt(D)) / (2 * a);
                                        System.out.println("D > 0, то кв. ур-е имеет 2 корня");
                                        System.out.println("X₁,₂ = -b +- √D / 2a = " +
                                                (-b) + " +- " + "√" + D + " / " + "2 * " + a + " = " +
                                                (-b) + " +- " + Math.sqrt(D) + " / " + (2 * a));
                                        System.out.println("x₁ = " + (-b) + " + " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b + Math.sqrt(D)) + " / " + (2 * a) + " = " + x1);
                                        System.out.println("x₂ = " + (-b) + " - " + Math.sqrt(D) + " / " + (2 * a) +
                                                " = " + (-b - Math.sqrt(D)) + " / " + (2 * a) + " = " + x2);
                                    } else if (D == 0) {
                                        double x = -(b / (2 * a));
                                        System.out.println("D = 0, то кв. ур-е имеет 1 корень");
                                        System.out.println("x = -b / 2a = " + (-b) + " / " + "2 * " + a + " = " +
                                                (-b) + " / " + (2 * a) + " = " + x);
                                    } else {
                                        System.out.println("D < 0, то кв. ур-е не имеет действительных корней");
                                    }
                                }
                            }

                        }
                    }
                }
            } else if (sc == 2){
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
                            double p = b / a;
                            double q = c / a;
                            double sqrt = (p / 2) * (p / 2);
                            if (b > 0) {
                                if (c > 0) {
                                    System.out.println("Получилось уравнение " + a + "x²+" + b + "x+" + c + " = 0");
                                } else {
                                    System.out.println("Получилось уравнение " + a + "x²+" + b + "x" + c + " = 0");
                                }
                            } else {
                                if (c > 0) {
                                    System.out.println("Получилось уравнение " + a + "x²" + b + "x+" + c + " = 0");
                                } else {
                                    System.out.println("Получилось уравнение " + a + "x²+" + b + "x" + c + " = 0");
                                }
                            }
                            if (p > 0) {
                                if (q > 0) {
                                    if (a != 1) {
                                        System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное кв. ур-е " +
                                                "x²+" + p + "x+" + q + " = 0");
                                    }
                                    System.out.println("X₁,₂ = - p/2 +- √(p/2)² - q;");
                                    System.out.println("X₁,₂ = - " + p + "/" + "2 +- √(" + p + "/2)² - " + q + " = " +
                                            (-(p / 2)) + " +- √" + (p / 2) + "² - " + q + " = " + (-(p / 2)) + " +- √" + sqrt + " - " + q + " = " +
                                            (-(p / 2)) + " +- √" + (sqrt - q) + " = " + (-(p / 2)) + " +- " + Math.sqrt(sqrt - q));
                                    double x1 = -(p / 2) + Math.sqrt(sqrt - q);
                                    double x2 = -(p / 2) - Math.sqrt(sqrt - q);
                                    System.out.println("x₁ = " + (-(p / 2)) + " + " + Math.sqrt(sqrt - q) + " = " + x1);
                                    System.out.println("x₂ = " + (-(p / 2)) + " - " + Math.sqrt(sqrt - q) + " = " + x2);
                                    if (x1 == (int) x1 && x2 == (int) x2) {
                                        System.out.println("ИЛИ");
                                        if (a != 1) {
                                            System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                    "x²+" + p + "x+" + q + " = 0");
                                        }
                                        System.out.println("p = " + p + "; q = " + q);
                                        System.out.println("x₁+x₂ = -p; x₁x₂ = q");
                                        System.out.println("x₁+x₂ = " + (-p));
                                        System.out.println("x₁x₂ = " + q);
                                        System.out.println("x₁ = " + x1 + "; x₂ = " + x2);
                                    } else {
                                        System.out.println("");
                                    }
                                } else {
                                    if (a != 1) {
                                        System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                "x²+" + p + "x" + q + " = 0");
                                    }
                                    System.out.println("X₁,₂ = - p/2 +- √(p/2)² - q;");
                                    System.out.println("X₁,₂ = - " + p + "/" + "2 +- √(" + p + "/2)² - (" + q + ") = " +
                                            (-(p / 2)) + " +- √" + (p / 2) + "² - (" + q + ") = " + (-(p / 2)) + " +- √" + sqrt + " + " + (-q) + " = " +
                                            (-(p / 2)) + " +- √" + (sqrt - q) + " = " + (-(p / 2)) + " +- " + Math.sqrt(sqrt - q));
                                    double x1 = -(p / 2) + Math.sqrt(sqrt - q);
                                    double x2 = -(p / 2) - Math.sqrt(sqrt - q);
                                    System.out.println("x₁ = " + (-(p / 2)) + " + " + Math.sqrt(sqrt - q) + " = " + x1);
                                    System.out.println("x₂ = " + (-(p / 2)) + " - " + Math.sqrt(sqrt - q) + " = " + x2);
                                    if (x1 == (int) x1 && x2 == (int) x2) {
                                        System.out.println("ИЛИ");
                                        if (a != 1) {
                                            System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                    "x²+" + p + "x" + q + " = 0");
                                        }
                                        System.out.println("p = " + p + "; q = " + q);
                                        System.out.println("x₁+x₂ = -p; x₁x₂ = q");
                                        System.out.println("x₁+x₂ = " + (-p));
                                        System.out.println("x₁x₂ = " + q);
                                        System.out.println("x₁ = " + x1 + "; x₂ = " + x2);
                                    } else {
                                        System.out.println("");
                                    }
                                }

                            } else {
                                if (q > 0) {
                                    if (a != 1) {
                                        System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                "x²" + p + "x+" + q + " = 0");
                                    }
                                    System.out.println("X₁,₂ = - p/2 +- √(p/2)² - q;");
                                    System.out.println("X₁,₂ = - " + p + "/" + "2 +- √(" + p + "/2)² - " + q + " = " +
                                            (-(p / 2)) + " +- √" + (p / 2) + "² - " + q + " = " + (-(p / 2)) + " +- √" + sqrt + " - " + q + " = " +
                                            (-(p / 2)) + " +- √" + (sqrt - q) + " = " + (-(p / 2)) + " +- " + Math.sqrt(sqrt - q));
                                    double x1 = -(p / 2) + Math.sqrt(sqrt - q);
                                    double x2 = -(p / 2) - Math.sqrt(sqrt - q);
                                    System.out.println("x₁ = " + (-(p / 2)) + " + " + Math.sqrt(sqrt - q) + " = " + x1);
                                    System.out.println("x₂ = " + (-(p / 2)) + " - " + Math.sqrt(sqrt - q) + " = " + x2);
                                    if (x1 == (int) x1 && x2 == (int) x2) {
                                        System.out.println("ИЛИ");
                                        if (a != 1) {
                                            System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                    "x²" + p + "x+" + q + " = 0");
                                        }
                                        System.out.println("p = " + p + "; q = " + q);
                                        System.out.println("x₁+x₂ = -p; x₁x₂ = q");
                                        System.out.println("x₁+x₂ = " + (-p));
                                        System.out.println("x₁x₂ = " + q);
                                        System.out.println("x₁ = " + x1 + "; x₂ = " + x2);
                                    } else {
                                        System.out.println("");
                                    }
                                } else {
                                    if (a != 1) {
                                        System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                "x²" + p + "x" + q + " = 0");
                                    }
                                    System.out.println("X₁,₂ = - p/2 +- √(p/2)² - q;");
                                    System.out.println("X₁,₂ = - " + p + "/" + "2 +- √(" + p + "/2)² - (" + q + ") = " +
                                            (-(p / 2)) + " +- √" + (p / 2) + "² - (" + q + ") = " + (-(p / 2)) + " +- √" + sqrt + " + " + (-q) + " = " +
                                            (-(p / 2)) + " +- √" + (sqrt - q) + " = " + (-(p / 2)) + " +- " + Math.sqrt(sqrt - q));
                                    double x1 = -(p / 2) + Math.sqrt(sqrt - q);
                                    double x2 = -(p / 2) - Math.sqrt(sqrt - q);
                                    System.out.println("x₁ = " + (-(p / 2)) + " + " + Math.sqrt(sqrt - q) + " = " + x1);
                                    System.out.println("x₂ = " + (-(p / 2)) + " - " + Math.sqrt(sqrt - q) + " = " + x2);
                                    if (x1 == (int) x1 && x2 == (int) x2) {
                                        System.out.println("ИЛИ");
                                        if (a != 1) {
                                            System.out.println("Делим обе части ур-я на " + a + "и получаем приведённое кв. ур-е " +
                                                    "x²" + p + "x" + q + " = 0");
                                        }
                                        System.out.println("p = " + p + "; q = " + q);
                                        System.out.println("x₁+x₂ = -p; x₁x₂ = q");
                                        System.out.println("x₁+x₂ = " + (-p));
                                        System.out.println("x₁x₂ = " + q);
                                        System.out.println("x₁ = " + x1 + "; x₂ = " + x2);
                                    } else {
                                        System.out.println("");
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (sc == 3){
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
            } else if(sc == 4) {
                while (true) {
                    System.out.println("Нажмите 0, чтобы выйти или 1, чтобы продолжить");
                    int exit = scanner.nextInt();
                    if (exit == 0) {
                        break;
                    } else {
                        System.out.println("Введите коэффициент факториала");
                        int a = scanner.nextInt();
                        System.out.print("Факториал равен: ");
                        System.out.println(factorial(a));

                    }
                }
            }else if(sc == 5){
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
            } else if (sc == 6){
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
            } else if (sc == 7){
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
            } else {
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
    private static int factorial(int a) {
        if (a == 1){
            return 1;
        }else {
            return a * factorial(a - 1);
        }
    }

}
