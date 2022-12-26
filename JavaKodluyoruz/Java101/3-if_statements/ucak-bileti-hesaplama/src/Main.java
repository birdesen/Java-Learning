import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, age;
        char type;
        double ticketPrice;

        System.out.print("Km bilgisi giriniz: ");
        km = input.nextInt();
        if (km < 0) {
            System.out.print("Geçersiz bir değer girdiniz. Lüften pozitif bir değer giriniz: ");
            km = input.nextInt();
        }

        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        if (age < 0) {
            System.out.print("Geçersiz bir değer girdiniz. Lüften pozitif bir değer giriniz: ");
            age = input.nextInt();
        }

        System.out.print("Yolculuk tipinizi giriniz(Tek-T / Çift-Ç): ");
        type = input.next().charAt(0);
        if (type != "Ç" && type != "T") {
            System.out.print("Geçersiz bir değer girdiniz. Lüften pozitif bir değer giriniz: ");
            type = input.next().charAt(0);
        }

        ticketPrice = km * 0.10;

        if (age >= 0 && age < 12) {
            ticketPrice *= 0.5;

        } else if (age <= 12 && age <= 24) {
            ticketPrice *= 0.9;
        } else if (age > 65) {
            ticketPrice *= 0.7;
        }
        if (type != "Ç" && type != "T") {
            System.out.println("geçersiz ");
        }
        if (type == "Ç") {
            ticketPrice *= 0.8;
            System.out.println("Uçak bileti ücretiniz: " + ticketPrice + "\nİyi yolculuklar dileriz");

        } else {
            System.out.println("Uçak bileti ücretiniz: " + ticketPrice + "\nİyi yolculuklar dileriz");
        }

        if (km < 0 || age < 0 || age > 110 || (type != "Ç" && type != "T")) {
            System.out.println("Hatalı giriş yaptığınız için bilet ücretinizi hesaplayamıyoruz.");
        }


    }
}
