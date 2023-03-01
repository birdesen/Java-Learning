import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 20;
        int c;
        int[] arr = new int[2];
        try { // hata alinmasi muhtemel yeri try blogu icine alinir
            System.out.println(b / a);
            c = input.nextInt();
            arr[10] = 11;
        } catch (ArithmeticException e) {
            System.out.println("Aritmetik hata alindi");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Yanlis veri girildi");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array hatasi alindi");
            System.out.println(e.getMessage());
        }
    }
}