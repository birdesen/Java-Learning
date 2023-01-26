package inter;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Tutarı giriniz: ");
        double price = input.nextDouble();

        System.out.print("Kart numarasını giriniz: ");
        String cardNumber = input.next();

        System.out.print("Son kullanma tarihi giriniz: ");
        String expirationDate = input.next();

        System.out.print("Güvenlik kodunu giriniz: ");
        String cvc = input.next();

        System.out.println("1. A bankası");
        System.out.println("2. B bankası");
        System.out.println("3. C bankası");
        System.out.print("Banka seçiniz: ");
        int selectBank = input.nextInt();

        switch (selectBank) {
            case 1:
                ABankasi aPos = new ABankasi("A bankası", "12121212", "123");
                aPos.connect("127.0.0.1");
                aPos.payment(price, cardNumber, expirationDate, cvc);
                break;
            case 2:
            default:
                System.out.println("Geçersiz işlem yaptınız, geçerli bir banka kodu giriniz.");
        }


    }
}
