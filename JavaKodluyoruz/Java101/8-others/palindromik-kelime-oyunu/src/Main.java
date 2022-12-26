import java.util.Scanner;

public class Main {

    static boolean isPalindrom(String word) {

        int i = 0;
        int j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("- - - - Palindromik Kelime Bulma - - - -");

        System.out.print("Bir sayı giriniz: ");
        String word = input.nextLine();

        if ((isPalindrom(word) == true)) {
            System.out.println("Palindromik kelimedir.");
        } else {
            System.out.println("Palindromik kelime değildir.");
        }
    }
}
