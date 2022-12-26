import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double armut = 2.14, elma = 3.67, dom = 1.11, muz = 0.95, pat = 5;

        System.out.print("Armut kaç kg: ");
        int armutKg = input.nextInt();
        System.out.print("Elma kaç kg: ");
        int elmaKg = input.nextInt();
        System.out.print("Domates kaç kg: ");
        int domKg = input.nextInt();
        System.out.print("Muz kaç kg: ");
        int muzKg = input.nextInt();
        System.out.print("Patates kaç kg: ");
        int patKg = input.nextInt();

        double tutar = (armut * armutKg) + (elma * elmaKg) + (dom * domKg) + (muz * muzKg) + (pat * patKg);
        System.out.println("Toplam tutar: " + tutar);

    }
}
