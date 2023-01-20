import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите b");
        double b = scanner.nextDouble();
        System.out.println("введите D");
        double D = scanner.nextDouble();
        String str1 = "-b +- √D";
        int lenght1 = str1.length();

        String str2 = "2a";
        String str3 = "-" + b + " +- " + "√" + D;

        System.out.print("       ");
        System.out.println(str1);

        System.out.print("X₁,₂ = ");
        for (int i = 0; i < lenght1; i++){
            System.out.print("-");
        }
        System.out.println("");

        System.out.print("       ");
        System.out.println(str2);

       /* System.out.println(str3);
        System.out.println(str3.length());
        */

    }
}
