import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("- - - - - Sayı Tahmin Oyunu - - - - -");

        int luckyNumber, guess, right = 0;
        luckyNumber = (int) (Math.random() * 100);

        while (right < 5) {
            System.out.print(" 0 ve 100 arasında bir tahmin giriniz: ");
            guess = input.nextInt();
            if (guess != luckyNumber) {
                System.out.println("Yanlış tahmin ettiniz");
                right++;
                if (guess < luckyNumber) {
                    System.out.println("Şanslı sayı " + guess + " sayısından büyüktür.");
                } else {
                    System.out.println("Şanslı sayı " + guess + " sayısından küçüktür.");
                }
                if (right == 5) {
                    System.out.println("Üzgünüz kaybettiniz.");
                    System.out.println("Şanslı sayı: " + luckyNumber);
                } else {
                    System.out.println("Kalan hakkınız: " + (5 - right));
                }
            } else {
                System.out.println("Tebrikler doğru tahmin ettiniz.");
                break;
            }
        }

    }
}
