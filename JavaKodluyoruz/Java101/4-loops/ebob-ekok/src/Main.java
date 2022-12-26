import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, ebob = 1;
        System.out.print("İlk sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b = input.nextInt();

        int n = 1;
        while (n < a || n < b) {

            if (a % n == 0 && b % n == 0) {
                ebob = n;
            }
            n++;
        }
        System.out.println("Ebob: " + ebob);

        System.out.print("Ekok: ");

        System.out.print(((a * b) / ebob));


    }
}
