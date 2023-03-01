import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException {
        if (age < 18) {
            throw new AgeCheckException("yas hatasi alindi"); // Exception("Yasiniz tutmuyor");
        }
        System.out.println("Yasi uygundur");
    }

    public static void main(String[] args) throws AgeCheckException{
        Scanner input = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        int age = input.nextInt();
        try {
            checkAge(age);
        } catch (AgeCheckException e) {
            System.out.println(e.toString());
        }
        System.out.println("Program bitti");
    }
}
