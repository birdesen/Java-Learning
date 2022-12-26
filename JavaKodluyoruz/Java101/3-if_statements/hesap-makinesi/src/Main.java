import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        int a = input.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        int b = input.nextInt();

        System.out.print("Bir işlem seçiniz( + - / * % ): ");
        char select = input.next().charAt(0);

        switch (select) {
            case '+':
                System.out.print(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.print(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.print(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                switch (b){
                    case 0:
                        System.out.print("Bir sayı sıfıra bölünemez");
                        break;
                    default:
                        System.out.print(a + " / " + b + " = " + (a / b));
                        break;
                }
            case '%':
                System.out.println(a + " % " + b + " = " + (a % b));
                break;

        }
    }
}
