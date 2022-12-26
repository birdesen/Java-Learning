import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        int a = input.nextInt();

        System.out.print("2. kenar uzunluğunu giriniz: ");
        int b = input.nextInt();

        System.out.print("3. kenar uzunluğunu giriniz: ");
        int c = input.nextInt();

        double u = (a + b + c) / 2;

        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Üçgenin alanı: " + alan);

    }
}
