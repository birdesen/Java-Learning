import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("C(n,r) = n! / (r! * (n-r)!)");
        int n, r, nFaktor = 1, rFaktor = 1, nrFaktor = 1;

        System.out.print("n sayısını sayı giriniz: ");
        n = input.nextInt();
        System.out.print("r sayısını giriniz: ");
        r = input.nextInt();

        for (int i = n; i > 0; i--) {
            nFaktor *= i;
        }
        for (int i = r; i > 0; i--) {
            rFaktor *= i;
        }
        for (int i = n - r; i > 0; i--) {
            nrFaktor *= i;
        }
        int result = nFaktor / (rFaktor * nrFaktor);

        System.out.println("C(" + n + "," + r + ") = " + n + "! / (" + r + "! * (" + n + "-" + r + ")!) = " + result);


    }
}
