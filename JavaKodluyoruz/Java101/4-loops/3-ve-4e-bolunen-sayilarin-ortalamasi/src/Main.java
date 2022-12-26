import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0, totalNumber = 0, count, n=0;
        System.out.print("Sayaç için bir sayı giriniz: ");
        count = input.nextInt();

        for (int i = 0; i < count; i++) {
            n +=1;
            if (n % 3 == 0 || n % 4 == 0) {
                total += n;
                totalNumber += 1;
            }
        }

        if (totalNumber == 0) {
            System.out.println("3'e veya 4'e bölünebilen sayı yoktur.");
        } else {
            double average = total / totalNumber;

            System.out.println(count + " sayısına kadar olan 3 ve 4'e tam bölünen sayıların ortalaması " + average);
        }
    }

}
