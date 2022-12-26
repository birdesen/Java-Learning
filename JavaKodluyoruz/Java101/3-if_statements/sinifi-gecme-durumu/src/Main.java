import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fiz, turk, kim, muz, ders = 5;

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if (mat < 0 || mat > 100) {
            mat = 0;
            ders -= 1;
        }
        System.out.print("Fizik notunu giriniz: ");
        fiz = input.nextInt();
        if (fiz < 0 || fiz > 100) {
            fiz = 0;
            ders -= 1;
        }
        System.out.print("Türkçe notunu giriniz: ");
        turk = input.nextInt();
        if (turk < 0 || turk > 100) {
            turk = 0;
            ders -= 1;
        }
        System.out.print("Kimya notunu giriniz: ");
        kim = input.nextInt();
        if (kim < 0 || kim > 100) {
            kim = 0;
            ders -= 1;
        }
        System.out.print("Müzik notunu giriniz: ");
        muz = input.nextInt();
        if (muz < 0 || muz > 100) {
            muz = 0;
            ders -= 1;
        }

        if (ders==0){
            System.out.println("Ortalamanız 0'dır. Kaldınız");
        }else{
            double ort = (mat + fiz + turk + kim + muz) / ders;
            if (ort>55){
                System.out.println("Ortalamanız " + ort + " Geçtiniz");
            }else{
                System.out.println("Ortalamanız " + ort + " Kaldınız");
            }
        }
    }
}
