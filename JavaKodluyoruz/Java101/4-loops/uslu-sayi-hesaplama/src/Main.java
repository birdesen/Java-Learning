import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, total = 1;
        System.out.print("Taban değerini giriniz: ");
        a = input.nextInt();
        System.out.print("Üst değerini giriniz:");
        b = input.nextInt();

        for (int i = 0; i < b; i++) {
            total *= a;
        }
        System.out.println(a + " ^ " + b + " = " + total);

    }
}
