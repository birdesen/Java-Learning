import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total4 = 1, total5 = 1;
        System.out.print("Sayaç için bir sayı giriniz: ");
        int count = input.nextInt();

        for (int i = 0; i <= count; i++) {
            if (i==0){
                total4=1;
                total5=1;
            }else{
                total4 *= 4;
                total5 *= 5;
            }
            System.out.println("4 ^ " + i + " = " + total4);
            System.out.println("5 ^ " + i + " = " + total5);
        }
    }
}
