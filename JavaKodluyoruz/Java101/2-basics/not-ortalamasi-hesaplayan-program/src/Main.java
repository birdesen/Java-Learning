import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fzk, kim, tur, tar, mzk;

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fzk = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kim = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        tur = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tar = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        mzk = input.nextInt();

        double ort = (mat + fzk + kim + tur + tar + mzk) / 6;
        System.out.println("Ortalamanız: " + ort);

        String sonuc = (ort > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);

    }
}
