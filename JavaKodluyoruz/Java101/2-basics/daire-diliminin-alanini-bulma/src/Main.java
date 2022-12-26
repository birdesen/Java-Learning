import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double PI = 3.14;

        System.out.print("Daire dilimimimn yarıçapını giriniz: ");
        int r = input.nextInt();

        System.out.print("Daire dilimimimn açısını giriniz: ");
        int a = input.nextInt();

        double alan = (PI * (r * r) * a) / 360;

        System.out.print("Daire dliminin alanı: " + alan);
    }
}
