import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double total = 0;
        System.out.print("harmonik serinin eleman sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 0; i < n; i++) {
            total += 1.0 / (i + 1);

        }
        System.out.println(n + " elemanlı harmonik serinin toplamı: " + total);
    }
}
