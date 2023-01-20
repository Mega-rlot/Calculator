import java.util.Scanner;

public class Viet {
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
                                System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                    System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                    System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                    System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
                                    System.out.println("Делим обе части уравнения на " + a + "и получаем приведёенное квадратное уравнение " +
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
    }
}