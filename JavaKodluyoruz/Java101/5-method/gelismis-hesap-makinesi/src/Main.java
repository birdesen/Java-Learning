import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Kaç sayı gireceksiniz: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int a = input.nextInt();
            result += a;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Kaç sayı gireceksiniz: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                System.out.print("ilk sayıyı giriniz: ");
                int a = input.nextInt();
                result = a;
            } else {
                System.out.print(i + ". sayıyı giriniz: ");
                int a = input.nextInt();
                result -= a;
            }
        }
        System.out.println("Sonuç: " + result);
    }

    static void multiply() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.println("Kaç sayı gireceksiniz: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int a = input.nextInt();
            result *= a;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divide() {
        Scanner input = new Scanner(System.in);
        int result = 0;
        System.out.println("Kaç sayı gireceksiniz: ");
        int count = input.nextInt();
        for (int i = 1; i <= count; i++) {
            if (i == 1) {
                System.out.print("ilk sayıyı giriniz: ");
                int a = input.nextInt();
                result = a;
            } else {
                System.out.print(i + ". sayıyı giriniz: ");
                int a = input.nextInt();
                if (a == 0) {
                    System.out.println("Bir sayı sıfıra bölünemez.");
                } else {
                    result /= a;
                }
            }
        }
        System.out.println("Sonuç: " + result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Taban değerini giriniz: ");
        int a = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int b = input.nextInt();
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int result = 1;
        System.out.print("Faktörüyeli alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        for (int i = a; i >= 1; i--) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz: ");
        int a = input.nextInt();
        System.out.print("Mod değerini giriniz: ");
        int b = input.nextInt();
        int result = a % b;
        System.out.println("Sonuç: " + result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenarı giriniz: ");
        int a = input.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int b = input.nextInt();
        int perimeterResult = 2 * (a + b);
        int areaResult = a * b;
        System.out.println("Çevre: " + perimeterResult);
        System.out.println("Alan: " + areaResult);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu = "\n"
                + "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Görüşmek üzere");
                    break;
                default:
                    System.out.println("Hatalı bir değer girdiniz, Lütfen tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
