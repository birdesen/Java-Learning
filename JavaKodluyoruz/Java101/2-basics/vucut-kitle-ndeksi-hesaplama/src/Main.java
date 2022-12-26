import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = input.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        double kilo = input.nextInt();

        double vki = kilo / (boy * boy);

        System.out.println("Vücut kitle indekiniz: " + vki);

    }
}
