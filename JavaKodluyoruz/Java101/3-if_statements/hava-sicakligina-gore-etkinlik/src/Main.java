import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int degree = input.nextInt();

        if (degree < 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (degree >= 5 && degree < 10) {
            System.out.println("Sinemaya gidebilirsiniz");
        } else if (degree >= 10 && degree <= 15) {
            System.out.println("Sinemaya gidebilirsiniz veya Piknik yapabilirsiniz");
        } else if (degree > 15 && degree <= 25) {
            System.out.println("Piknik yapabilirsiniz");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }


    }
}
