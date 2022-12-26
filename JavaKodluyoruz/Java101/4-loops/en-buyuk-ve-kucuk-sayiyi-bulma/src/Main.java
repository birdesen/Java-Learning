import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int enK = 1, enB = 1, n, x;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            x = input.nextInt();
            if (i == 1) {
                enB = x;
                enK = x;
            } else {
                if (x < enK) {
                    enK = x;
                }
                if (x > enB) {
                    enB = x;
                }
            }
        }
        System.out.println("En küçük: " + enK);
        System.out.println("En büyük: " + enB);
    }
}
