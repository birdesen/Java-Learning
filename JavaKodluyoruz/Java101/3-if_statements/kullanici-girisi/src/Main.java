import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        String userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String password = input.nextLine();

        if (userName.equals("patika") && password.equals("123")) {
            System.out.print("Giriş yaptınız.");
        } else if (userName.equals("patika")) {
            System.out.print("şifreniz hatalıdır\nŞifrenizi değiştirmek ister misiniz(evet-e/hayır-h): ");
            String answer = input.nextLine();
            if (answer.equals("E")) {
                System.out.print("Yeni şifreyi giriniz: ");
                password = input.nextLine();
                if (password.equals("123")){
                    System.out.print("Yeni şifre eskisi ile aynı olamaz. Lütfen bşka şifre giriniz: ");
                    password = input.nextLine();
                    System.out.println("Şifre oluşturuldu.");
                }else{
                    System.out.println("Şifre oluşturuldu.");
                }
            } else {
                System.out.println("Sisteme girişinizi gerçekleştiremiyoruz");
            }
        } else {
            System.out.println("Kullanıcı adınız yanlıştır. Sisteme girişinizi gerçekleştiremiyoruz");
        }
    }
}
