import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutarı giriniz: ");
        int kdvsizFiyat = input.nextInt();
        double kdvOrani = (kdvsizFiyat > 1000) ? 0.08 : 0.18;

        double kdvTutari = kdvsizFiyat * kdvOrani;

        double kdvliFiyat = kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + kdvsizFiyat);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        System.out.println("KDV oranı: " + kdvOrani);
        System.out.println("KDV tutarı: " + kdvTutari);


    }
}
