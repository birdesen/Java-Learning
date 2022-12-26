import java.util.Scanner;

public class Main {
    static int usAlma(int a, int b) {

        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else {
            return usAlma(a, b - 1) * a;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();
        System.out.println(a + " ^ " + b + " = " + usAlma(a, b));
    }
}
