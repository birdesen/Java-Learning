import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, total = 0;

        do {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0) {
                total += n;
                System.out.println(total);
            }
        } while (n % 2 == 0);
    }
}
