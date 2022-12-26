import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double aacilisUcreti = 10, kmUcreti = 0.2, tutar;

        System.out.print("Gidilen mesafeyi km cinsinden yazınız: ");
        int km = input.nextInt();

        tutar = aacilisUcreti + (km * kmUcreti);


        tutar = (tutar < 20) ? 20 : tutar;

        System.out.println("Taksimetre ücreti : " + tutar);

    }
}
