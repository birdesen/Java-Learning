import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, newN, odd, total = 0;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        newN = n;
        while (newN > 0) {
            odd = newN % 10;
            newN /= 10;
            total += odd;
        }
        System.out.println(n + " sayısının basamak sayıları toplamı " + total);

    }
}
