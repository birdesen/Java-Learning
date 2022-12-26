import java.util.Scanner;

public class Main {
    static int patternLeft(int n, int count) {
        System.out.print(n + " ");
        count++;
        if (n <= 0) {
            return patternRight(n + 5, count) + 5;
        }
        return patternLeft(n - 5, count) - 5;
    }

    static int patternRight(int n, int count) {
        System.out.print(n + " ");
        count--;
        if (count == 1) {
            return n;
        }
        return patternRight(n + 5, count) + 5;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();
        int count = 0;
        patternLeft(n, count);
    }
}
